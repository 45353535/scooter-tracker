package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.mbsignalcommon.mapping.b;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public class h implements b, Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Pattern f49834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f49835b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Context f49837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected WindVaneWebView f49838e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f49836c = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Handler f49839f = new Handler(Looper.getMainLooper(), this);

    public h(Context context) {
        this.f49837d = context;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(WindVaneWebView windVaneWebView) {
        this.f49838e = windVaneWebView;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public boolean b(String str) {
        if (!i.f(str)) {
            return false;
        }
        a(i.c(str));
        d(str);
        return true;
    }

    public a c(String str) {
        if (str == null) {
            return null;
        }
        a aVarA = com.mbridge.msdk.mbsignalcommon.mraid.c.a(this.f49838e, str);
        if (aVarA != null) {
            aVarA.f49808b = this.f49838e;
            return aVarA;
        }
        Matcher matcher = this.f49834a.matcher(str);
        if (matcher.matches()) {
            a aVar = new a();
            int iGroupCount = matcher.groupCount();
            if (iGroupCount >= 5) {
                aVar.f49812f = matcher.group(5);
            }
            if (iGroupCount >= 3) {
                aVar.f49810d = matcher.group(1);
                aVar.f49813g = matcher.group(2);
                String strGroup = matcher.group(3);
                aVar.f49811e = strGroup;
                HashMap<String, String> map = com.mbridge.msdk.mbsignalcommon.base.e.f49709k;
                if (map != null && map.containsKey(strGroup)) {
                    aVar.f49811e = com.mbridge.msdk.mbsignalcommon.base.e.f49709k.get(aVar.f49811e);
                }
                aVar.f49808b = this.f49838e;
                return aVar;
            }
        }
        return null;
    }

    public void d(String str) {
        this.f49835b = str;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        a aVar = (a) message.obj;
        if (aVar == null) {
            return false;
        }
        try {
            if (message.what == 1) {
                Object obj = aVar.f49809c;
                b.C0542b c0542b = aVar.f49807a;
                if (c0542b != null && obj != null) {
                    c0542b.a(obj, aVar, TextUtils.isEmpty(aVar.f49812f) ? JsonUtils.EMPTY_JSON : aVar.f49812f);
                }
                return true;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return false;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.windvane.b
    public void a(String str) {
        a aVarC;
        if (TextUtils.isEmpty(str) || (aVarC = c(str)) == null) {
            return;
        }
        a(aVarC);
    }

    protected void a(a aVar) {
        WindVaneWebView windVaneWebView = aVar.f49808b;
        Object jsObject = windVaneWebView == null ? null : windVaneWebView.getJsObject(aVar.f49810d);
        if (jsObject == null) {
            return;
        }
        try {
            b.C0542b c0542bA = com.mbridge.msdk.mbsignalcommon.mapping.b.a(this.f49837d.getClassLoader(), jsObject.getClass().getName()).a(aVar.f49811e, Object.class, String.class);
            c0542bA.a();
            if (jsObject instanceof g) {
                aVar.f49807a = c0542bA;
                aVar.f49809c = jsObject;
                a(1, aVar);
            }
        } catch (com.mbridge.msdk.mbsignalcommon.mapping.a e10) {
            e10.printStackTrace();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    protected void a(int i10, a aVar) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i10;
        messageObtain.obj = aVar;
        this.f49839f.sendMessage(messageObtain);
    }

    public void a(Pattern pattern) {
        this.f49834a = pattern;
    }
}
