// Generated by Dagger (https://google.github.io/dagger).
package com.demo.imagesearch.di;

import com.demo.imagesearch.room.AppDatabase;
import com.demo.imagesearch.room.imagedetails.ImageDetailsDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DBModule_ProvideImageDetailsDaoFactory implements Factory<ImageDetailsDao> {
  private final DBModule module;

  private final Provider<AppDatabase> databaseProvider;

  public DBModule_ProvideImageDetailsDaoFactory(
      DBModule module, Provider<AppDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public ImageDetailsDao get() {
    return provideImageDetailsDao(module, databaseProvider.get());
  }

  public static DBModule_ProvideImageDetailsDaoFactory create(
      DBModule module, Provider<AppDatabase> databaseProvider) {
    return new DBModule_ProvideImageDetailsDaoFactory(module, databaseProvider);
  }

  public static ImageDetailsDao provideImageDetailsDao(DBModule instance, AppDatabase database) {
    return Preconditions.checkNotNull(
        instance.provideImageDetailsDao(database),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
