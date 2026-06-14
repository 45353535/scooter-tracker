package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.unity3d.services.UnityAdsConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements com.fyber.inneractive.sdk.cache.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20349a = false;

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        String str = IAConfigManager.O.f20297c;
        StringBuilder sb2 = new StringBuilder(DtbConstants.HTTPS);
        int i10 = k.f20410a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.baseConfigUrl");
        if (TextUtils.isEmpty(property)) {
            sb2.append("cdn2.inner-active.mobi/ia-sdk-config/apps/");
        } else {
            sb2.append(property);
        }
        sb2.append(str);
        sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb2.append(str);
        sb2.append(".json");
        return sb2.toString();
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return "IALastModifiedFromHeader";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return "inneractive.config";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        String string = com.fyber.inneractive.sdk.util.o.f23888a.getSharedPreferences("IAConfigurationPreferences", 0).getString("cached.config.appid", null);
        return string != null && string.equalsIgnoreCase(IAConfigManager.O.f20297c);
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(Object obj) {
        h0 h0Var = (h0) obj;
        if (h0Var == null || h0Var.f20401a == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.o.f23888a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("cached.config.appid", h0Var.f20401a).apply();
    }

    public final void a(String str, Throwable th2) {
        String strSubstring;
        String name;
        String localizedMessage;
        if (this.f20349a) {
            return;
        }
        this.f20349a = true;
        if (!TextUtils.isEmpty(str)) {
            strSubstring = str.substring(0, str.length() > 501 ? 500 : str.length() - 1);
        } else {
            strSubstring = "Empty Json Data";
        }
        if (th2 != null) {
            name = th2.getClass().getName();
            localizedMessage = th2.getLocalizedMessage();
        } else {
            name = "Bad remote configuration";
            localizedMessage = UnityAdsConstants.Messages.MSG_INTERNAL_ERROR;
        }
        String str2 = IAConfigManager.O.f20297c;
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.t.FATAL_CONFIGURATION_ERROR);
        if (localizedMessage == null) {
            localizedMessage = "No message";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "EMPTY_APP_ID";
        }
        wVar.a("exception", name, PglCryptUtils.KEY_MESSAGE, localizedMessage, "data", strSubstring, RemoteConfigConstants.RequestFieldKey.APP_ID, str2).a((String) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.config.h0 a(com.fyber.inneractive.sdk.config.remote.e r27) {
        /*
            Method dump skipped, instruction units count: 1330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.f.a(com.fyber.inneractive.sdk.config.remote.e):com.fyber.inneractive.sdk.config.h0");
    }

    public static Object a(Object obj, Object... objArr) {
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                return obj2;
            }
        }
        return obj;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) {
        try {
            IAConfigManager iAConfigManager = IAConfigManager.O;
            iAConfigManager.D.f();
            com.fyber.inneractive.sdk.config.remote.e eVarA = com.fyber.inneractive.sdk.config.remote.e.a(new JSONObject(str));
            String str2 = iAConfigManager.f20297c;
            if (eVarA != null && str2.equals(eVarA.f20451a.f20440a)) {
                return a(eVarA);
            }
            IAlog.b("internal error while parsing local configuration", new Object[0]);
            if (eVarA != null && !str2.equals(eVarA.f20451a.f20440a)) {
                throw new InvalidAppIdException();
            }
            a(str, (Throwable) null);
            return null;
        } catch (Throwable th2) {
            a(str, th2);
            IAlog.b("Exception Error while parsing local configuration", new Object[0]);
            throw th2;
        }
    }
}
