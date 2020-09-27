// Generated by Dagger (https://google.github.io/dagger).
package com.demo.imagesearch.di;

import android.content.Context;
import com.demo.imagesearch.room.AppDatabase;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DBModule_ProvideDatabaseFactory implements Factory<AppDatabase> {
  private final DBModule module;

  private final Provider<Context> applicationProvider;

  public DBModule_ProvideDatabaseFactory(DBModule module, Provider<Context> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public AppDatabase get() {
    return provideDatabase(module, applicationProvider.get());
  }

  public static DBModule_ProvideDatabaseFactory create(
      DBModule module, Provider<Context> applicationProvider) {
    return new DBModule_ProvideDatabaseFactory(module, applicationProvider);
  }

  public static AppDatabase provideDatabase(DBModule instance, Context application) {
    return Preconditions.checkNotNull(
        instance.provideDatabase(application),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
