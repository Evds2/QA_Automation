package dataproviders;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.testng.annotations.DataProvider;
import pojo.poundSterlingCurrencyData;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class poundSterlingCurrencyProvider {

    @DataProvider(name="getPoundSterlingCurrency")
    private Object[][] getPoundSterlingDataFromJson() throws FileNotFoundException {
        JsonElement jsonData = new JsonParser().parse(new FileReader("src/test/Resources/data" +
                "/poundSterlingCurrency.json"));
        JsonElement dataSet = jsonData.getAsJsonObject().get("dataset");
        //jala toda la info de la clase login data
        List<poundSterlingCurrencyData> testData = new Gson().fromJson(dataSet, new
                TypeToken<List<poundSterlingCurrencyData>>() {}.getType());

        Object[][] returnValue = new Object[testData.size()][1];

        int index = 0;

        for (Object[] each: returnValue){
            each[0] = testData.get(index++);
        }

        return returnValue;
    }
}
