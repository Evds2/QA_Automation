package dataproviders;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.testng.annotations.DataProvider;
import pojo.euroCurrencyData;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class euroCurrencyProvider {

    @DataProvider(name="getEuroCurrencyFromJson")
    private Object[][] getEuroDataFromJson() throws FileNotFoundException {
        JsonElement jsonData = new JsonParser().parse(new FileReader("src/test/Resources/data/euroCurrency.json"));
        JsonElement dataSet = jsonData.getAsJsonObject().get("dataset");
        //jala toda la info de la clase login data
        List<euroCurrencyData> testData = new Gson().fromJson(dataSet, new TypeToken<List<euroCurrencyData>>() {}.getType());

        Object[][] returnValue = new Object[testData.size()][1];

        int index = 0;

        for (Object[] each: returnValue){
            each[0] = testData.get(index++);
        }

        return returnValue;
    }
}
