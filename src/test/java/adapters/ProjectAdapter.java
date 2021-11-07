package adapters;

import com.google.gson.reflect.TypeToken;
import com.google.gson.Gson;
import models.Project;
import models.Response;

public class ProjectAdapter extends BaseAdapter {

    public void createProject(Project project) {
        post(new Gson().toJson(project), "v1/project/");
    }

    public void deleteProject(String code) {
        delete("v1/project/" + code);
    }

    public Response<Project> getProject(String code) {
        String body = get("v1/project/" + code);
        return new Gson().fromJson(body, new TypeToken<Response<Project>>() {}.getType());
    }
}
