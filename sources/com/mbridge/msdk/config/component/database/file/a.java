package com.mbridge.msdk.config.component.database.file;

import android.text.TextUtils;
import com.ironsource.V5;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f46853a = "FileOperate";

    public void a(String str) {
        ArrayList arrayList;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map<String, Object> mapD = com.mbridge.msdk.config.component.database.a.a().d(str.startsWith("DELETE") ? str.replaceFirst("DELETE", "SELECT") : str.startsWith("delete") ? str.replaceFirst("delete", "SELECT") : "");
        if (mapD == null || mapD.isEmpty() || !(mapD.get("data") instanceof List) || (arrayList = (ArrayList) mapD.get("data")) == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((Map) it.next()).entrySet()) {
                if (((String) entry.getKey()).equals(V5.c.f41893c)) {
                    arrayList2.add(String.valueOf(entry.getValue()));
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            a(new File((String) it2.next()));
        }
    }

    public void a(File file) {
        if (file == null || !file.exists()) {
            return;
        }
        if (file.isFile()) {
            file.delete();
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                a(new File(file2.getAbsolutePath()));
            }
        }
        file.delete();
    }
}
