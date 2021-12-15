package adapters;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import models.Response;
import models.Suite;

public class SuiteAdapter extends BaseAdapter {

    public void createSuite(Suite suite, String code) {
        post(new Gson().toJson(suite), "v1/suite/" + code);
    }

    public void deleteSuite(String code, int id) {
        delete(String.format("v1/suite/%s/%d", code, id));
    }

    public Response<Suite> getSuite(String code, int id) {
        String body = get(String.format("v1/suite/%s/%d", code, id));
        return new Gson().fromJson(body, new TypeToken<Response<Suite>>() {}.getType());
    }
}
