package prestaya.retrofitdagger.di;


import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import prestaya.retrofitdagger.RetrofitApp;

/**
 * @author SudTechnologies
 */
@Singleton
@Component(modules = {
        AppModule.class,
        AndroidInjectionModule.class,
        BuildersModule.class
})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(RetrofitApp app);
        AppComponent build();
    }

    void inject(RetrofitApp app);
}
