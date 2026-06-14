package com.my.tracker.personalize;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.m;
import com.my.tracker.obfuscated.s0;
import com.my.tracker.obfuscated.x2;
import com.my.tracker.obfuscated.y2;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class PersonalizeApiClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f62001a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f62002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Context f62003b;

        @Nullable
        @WorkerThread
        public PersonalizeApiClient build() {
            y2 y2Var = MyTracker.a.f61199a;
            String strG = y2Var.g();
            if (TextUtils.isEmpty(strG)) {
                x2.a("Builder: MyTracker hasn't been initialized. Initialize it before using Personalize API");
                return null;
            }
            Context context = this.f62003b;
            String instanceId = context != null ? MyTracker.getInstanceId(context) : null;
            List list = this.f62002a;
            return new PersonalizeApiClient(new a(strG, (list == null || instanceId == null || !list.contains(instanceId)) ? y2Var.l() : y2Var.k()));
        }

        @NonNull
        @AnyThread
        public Builder withTestDevices(@Nullable Context context, @Nullable List<String> list) {
            this.f62002a = list;
            this.f62003b = context;
            return this;
        }
    }

    public interface OnCompleteListener<T> {
        void onRequestComplete(@NonNull PersonalizeApiClient personalizeApiClient, @NonNull PersonalizeRequest<T> personalizeRequest, @NonNull PersonalizeResponse<T> personalizeResponse);
    }

    PersonalizeApiClient(a aVar) {
        this.f62001a = aVar;
    }

    @NonNull
    @AnyThread
    public static Builder newBuilder() {
        return new Builder();
    }

    @AnyThread
    public <T> void sendRequest(@NonNull final PersonalizeRequest<T> personalizeRequest, @Nullable final Handler handler, @NonNull final OnCompleteListener<T> onCompleteListener) {
        final String strA = a(personalizeRequest, this.f62001a);
        m.b(new Runnable() { // from class: com.my.tracker.personalize.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f62015b.a(strA, personalizeRequest, handler, onCompleteListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, PersonalizeRequest personalizeRequest, Handler handler, OnCompleteListener onCompleteListener) {
        a(personalizeRequest, s0.a((MyTrackerConfig.OkHttpClientProvider) null).a(str), handler, onCompleteListener);
    }

    private void a(final PersonalizeRequest personalizeRequest, Object obj, String str, Handler handler, final String str2, final OnCompleteListener onCompleteListener) {
        if (handler == null) {
            handler = m.f61657a;
        }
        if (!TextUtils.isEmpty(str2)) {
            x2.b("PersonalizeApiClient: " + str2);
            handler.post(new Runnable() { // from class: com.my.tracker.personalize.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f62020b.a(onCompleteListener, personalizeRequest, str2);
                }
            });
            return;
        }
        final PersonalizeResponse personalizeResponse = new PersonalizeResponse(obj, null, str);
        handler.post(new Runnable() { // from class: com.my.tracker.personalize.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f62024b.a(onCompleteListener, personalizeRequest, personalizeResponse);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, String str) {
        onCompleteListener.onRequestComplete(this, personalizeRequest, new PersonalizeResponse(null, str, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, PersonalizeResponse personalizeResponse) {
        onCompleteListener.onRequestComplete(this, personalizeRequest, personalizeResponse);
    }

    private void a(PersonalizeRequest personalizeRequest, s0.b bVar, Handler handler, OnCompleteListener onCompleteListener) {
        if (bVar == null) {
            x2.a("PersonalizeApiClient: MyTracker hasn't been initialized yet");
            a(personalizeRequest, null, null, handler, "MyTracker hasn't been initialized yet", onCompleteListener);
            return;
        }
        String str = (String) bVar.b();
        if (TextUtils.isEmpty(str)) {
            x2.a("PersonalizeApiClient: HTTP response is empty");
            a(personalizeRequest, null, null, handler, "HTTP response is empty", onCompleteListener);
            return;
        }
        try {
            c cVarA = personalizeRequest.c().a(new JSONObject(str));
            String strA = cVarA.a();
            if (strA != null) {
                a(personalizeRequest, null, null, handler, strA, onCompleteListener);
            } else {
                a(personalizeRequest, cVarA.b(), str, handler, null, onCompleteListener);
            }
        } catch (Throwable th2) {
            String str2 = "Can't parse JSON with error: " + th2.getMessage();
            x2.a("PersonalizeApiClient: " + str2);
            a(personalizeRequest, null, null, handler, str2, onCompleteListener);
        }
    }

    private String a(PersonalizeRequest personalizeRequest, a aVar) {
        String str = aVar.f62012b + "/api/v1/recommendation" + personalizeRequest.a();
        Map mapB = personalizeRequest.b();
        mapB.remove(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY);
        if (mapB.isEmpty()) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : mapB.entrySet()) {
            String str2 = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                builderBuildUpon.appendQueryParameter(str2, (String) it.next());
            }
        }
        builderBuildUpon.appendQueryParameter(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, aVar.f62011a);
        return builderBuildUpon.toString();
    }
}
