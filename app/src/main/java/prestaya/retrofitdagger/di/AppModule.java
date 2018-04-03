package prestaya.retrofitdagger.di;

import android.content.Context;
import android.graphics.Typeface;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import java.util.Date;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import prestaya.retrofitdagger.RetrofitApp;

/**
 * @author SudTechnologies
 */
@Module
public class AppModule {

    @Provides
    Context provideContext(RetrofitApp app) {
        return app.getApplicationContext();
    }

    @Provides
    @Singleton
    public Gson provideGson() {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Date.class, (JsonDeserializer<Date>) (json, typeOfT, context) -> new Date(json.getAsJsonPrimitive().getAsLong()));

        return builder.create();
    }
}
