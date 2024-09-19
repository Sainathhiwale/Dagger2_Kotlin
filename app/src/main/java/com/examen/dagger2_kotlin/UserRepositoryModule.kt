package com.examen.dagger2_kotlin


import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module()
 class UserRepositoryModule {


     @Provides
    fun provideSqlRepository():UserRepository{
        return SQLRepository()
    }


   /* @Provides
    fun providesFirebase():UserRepository{
        return FirebaseRepository()
    }*/
}