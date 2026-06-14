package com.amazon.device.ads;

import com.ironsource.C4240b4;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public abstract class MraidCommand {
    static HashMap<String, Class> commandRepository = new HashMap<>();

    public static Class<MraidCommand> findMraidCommandByName(String str) {
        return commandRepository.get(str);
    }

    public static Map<String, String> parseQueryString(String str) {
        String[] strArrSplit = str.split(C4240b4.j.f42670c);
        HashMap map = new HashMap();
        for (String str2 : strArrSplit) {
            int iIndexOf = str2.indexOf(61);
            if (iIndexOf > 0 && iIndexOf < str2.length() - 1) {
                map.put(str2.substring(0, iIndexOf), str2.substring(iIndexOf + 1));
            }
        }
        return map;
    }

    static void registerCommand(String str, Class cls) {
        commandRepository.put(str, cls);
    }

    public void execute(JSONObject jSONObject, DTBAdMRAIDController dTBAdMRAIDController) throws JSONException {
    }

    public abstract String getName();
}
