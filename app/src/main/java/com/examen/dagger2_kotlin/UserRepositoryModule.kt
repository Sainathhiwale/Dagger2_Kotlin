package com.examen.dagger2_kotlin


import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module()
 class UserRepositoryModule {

     @Named("SQLRepository")
    @Provides
    fun provideSqlRepository():UserRepository{
        return SQLRepository()
    }


    @Provides
    fun providesFirebase():UserRepository{
        return FirebaseRepository()
    }
}