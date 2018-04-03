package prestaya.retrofitdagger.di;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import prestaya.retrofitdagger.MainActivity;

/**
 * @author SudTechnologies
 */
@Module
public abstract class BuildersModule {

    @ContributesAndroidInjector
    abstract MainActivity bindMainActivity();

}
