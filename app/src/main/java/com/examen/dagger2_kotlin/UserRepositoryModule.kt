package com.examen.dagger2_kotlin

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module()
 class UserRepositoryModule {

   /* @Provides
    fun provideSqlRepository():UserRepository{
        return SQLRepository()
    }*/


    @Provides
    fun providesFirebase():UserRepository{
        return FirebaseRepository()
    }
}