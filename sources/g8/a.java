package g8;

import com.yandex.div.data.EntityTemplate;
import com.yandex.div.json.ParsingExceptionKt;
import com.yandex.div.json.templates.TemplateProvider;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class a {
    public static EntityTemplate a(TemplateProvider templateProvider, String str, JSONObject jSONObject) {
        EntityTemplate entityTemplate = templateProvider.get(str);
        if (entityTemplate != null) {
            return entityTemplate;
        }
        throw ParsingExceptionKt.templateNotFound(jSONObject, str);
    }
}
