package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.settings.to;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class jpc extends to {
    static final ArrayList<String> mml = new ArrayList<>(Arrays.asList("ja", "en", "ko", "zh", "th", "vi", "id", "ru", "ar", "fr", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "it", "es", "hi", "pt", "zh-Hant", "ms", "pl", "tr"));
    public boolean lnr;
    private Set<String> mzz;

    public jpc(to.qdl qdlVar) {
        super("tt_sdk_settings_sr.prop", qdlVar);
        this.mzz = DesugarCollections.synchronizedSet(new HashSet());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(78:0|2|(1:8)(76:5|(1:7)|10|(1:12)(1:13)|14|(3:16|(1:20)|21)|22|(1:24)|25|(3:27|(1:31)|32)|33|(4:35|(1:37)(1:38)|39|(1:41))(1:42)|43|(1:45)|46|(4:48|(1:50)|51|(1:53))(1:54)|55|(1:59)|60|(1:62)|63|(1:65)|66|(1:68)|69|(1:71)|72|(1:74)|75|(1:77)|78|(1:80)|81|(1:83)|84|(1:86)|87|(1:89)|90|(1:92)|93|(1:95)|96|(1:98)|99|(1:101)|102|(16:104|(2:106|(1:110))|111|(1:113)|114|(1:116)|117|(1:119)|120|(1:122)|123|(1:125)|126|(1:128)|129|(4:360|131|(3:135|(2:138|136)|362)|141))|142|144|(1:146)|147|(14:149|(1:151)(1:152)|153|(1:155)|156|(1:158)|159|(1:161)|162|(1:164)|165|(2:167|(1:169)(1:170))|171|(4:173|(1:177)|(1:179)(1:180)|181))|182|(1:184)|185|(3:187|(1:191)|192)|193|(3:195|(1:199)|200)|201|(1:203)|204|(30:206|(1:208)|209|(1:211)|212|(1:214)|215|(1:217)|218|(1:220)|221|(1:223)|224|(1:226)|227|(1:229)|230|(1:232)|233|(1:235)|236|(1:238)|239|(1:241)|242|(1:244)|245|(1:247)|248|(1:250))|251|(3:356|253|(46:255|(2:257|(1:259))|262|(2:264|(1:266))|267|(1:269)|270|(1:272)|273|(1:275)|276|(1:278)|279|(1:281)|282|(1:287)|288|(1:290)|291|(2:293|(1:295))|296|(1:298)|299|(1:301)|302|(1:304)|305|(1:307)|308|(1:310)|311|(1:313)|314|(1:316)|317|(1:319)|320|(1:322)|323|(1:325)|326|(1:328)|329|(1:331)|332|(1:334)))|337|358|338|342|(1:344)|345|(1:347)|348|(2:350|(1:352)(1:353))|354|355)|9|10|(0)(0)|14|(0)|22|(0)|25|(0)|33|(0)(0)|43|(0)|46|(0)(0)|55|(2:57|59)|60|(0)|63|(0)|66|(0)|69|(0)|72|(0)|75|(0)|78|(0)|81|(0)|84|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|(0)|102|(0)|142|144|(0)|147|(0)|182|(0)|185|(0)|193|(0)|201|(0)|204|(0)|251|(0)|337|358|338|342|(0)|345|(0)|348|(0)|354|355) */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0769, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x076a, code lost:
    
        com.bytedance.sdk.component.utils.aaj.lnr("SettingsDefaultRepository", "coreSettingJson", r0.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0567 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0241  */
    @Override // com.bytedance.sdk.openadsdk.core.settings.mzz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void qdl(org.json.JSONObject r35) {
        /*
            Method dump skipped, instruction units count: 2005
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.settings.jpc.qdl(org.json.JSONObject):void");
    }

    public static Set<String> qdl(Set<String> set) {
        try {
            if (set == null) {
                return new HashSet();
            }
            HashSet hashSet = new HashSet();
            for (String str : set) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            return hashSet;
        } catch (Throwable unused) {
            return new HashSet();
        }
    }
}
