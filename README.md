# Constructor Dependency
1. constructor injection to provide the UserRegistrationService class
D:\AndroidStudioProjects\KotlinSample\app\build\tmp\kapt3\stubs\debug\com\examen\dagger2_kotlin\UserRegisterationComponent.java:7: error: [Dagger/MissingBinding] com.examen.dagger2_kotlin.UserRegistrationService cannot be provided without an @Inject constructor or an @Provides-annotated method.
public abstract interface UserRegisterationComponent {
                ^
  
  Missing binding usage:
      com.examen.dagger2_kotlin.UserRegistrationService is requested at
          com.examen.dagger2_kotlin.UserRegisterationComponent.getUserRegisterationService()

@Component
interface UserRegisterationComponent {
 fun getUserRegisterationService():UserRegistrationService
}
Inside the Component getUserRegisterationService doe not found the dependency so need to ad @provide and Module class to provide the dependency to required classes or component.

2. Provide the constructor injection to UserRegistrationService class but still dagger does not found dependency of emailservice and UserRepository class

    class UserRegistrationService @Inject constructor(private val userRepository:UserRepository, private  val emailService:EmailService){
    
        fun registerUser(email:String,password:String){
            userRepository.saveUser(email,password)
            emailService.sent(email,"sainath@gmail.com","Hello")
        }
    }

D:\AndroidStudioProjects\KotlinSample\app\build\tmp\kapt3\stubs\debug\com\examen\dagger2_kotlin\UserRegisterationComponent.java:7: error: [Dagger/MissingBinding] com.examen.dagger2_kotlin.UserRepository cannot be provided without an @Inject constructor or an @Provides-annotated method.
public abstract interface UserRegisterationComponent {
                ^
  
  Missing binding usage:
      com.examen.dagger2_kotlin.UserRepository is injected at
          com.examen.dagger2_kotlin.UserRegistrationService(userRepository, �)
      com.examen.dagger2_kotlin.UserRegistrationService is requested at
          com.examen.dagger2_kotlin.UserRegisterationComponent.getUserRegisterationService()

3. adding dependency EmailService and UserRepository classes using @Inject constructor

        class EmailService @Inject constructor(){
       fun sent(to:String,from:String,body:String){
          Log.d("EmailService", "sent: ")
        }
     }

       class UserRepository @Inject constructor() {
        fun saveUser(email: String, password: String) {
            Log.d("UserRepository", "saveUser: ")
        }
       }

   4. Main activity inject requried the dependency
            class MainActivity : AppCompatActivity() {
           val component = DaggerUserRegisterationComponent.builder().build()
          private lateinit var mainBinding: ActivityMainBinding
          override fun onCreate(savedInstanceState: Bundle?) {
              super.onCreate(savedInstanceState)
              mainBinding = ActivityMainBinding.inflate(layoutInflater)
              setContentView(mainBinding.root)
              val userRegistrationService = component.getUserRegisterationService()
              userRegistrationService.registerUser("dummy@gmail.com","123456")
              val emailService = component.getEmailService()
               emailService.sent("john@gmail.com", "dummy@gmail.com","dummy")
          }
      }
