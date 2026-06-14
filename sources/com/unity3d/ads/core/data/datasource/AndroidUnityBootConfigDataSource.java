package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uf.c;
import uf.r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidUnityBootConfigDataSource;", "Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "getValue", "", C4240b4.i.W, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidUnityBootConfigDataSource implements UnityBootConfigDataSource {

    @NotNull
    private final Context context;

    public AndroidUnityBootConfigDataSource(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.unity3d.ads.core.data.datasource.UnityBootConfigDataSource
    @Nullable
    public String getValue(@NotNull String key) {
        Object objB;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.f93230c;
            final String str = key + D5.T;
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            InputStream stream = this.context.getAssets().open("bin/Data/boot.config");
            try {
                Intrinsics.checkNotNullExpressionValue(stream, "stream");
                r.d(new BufferedReader(new InputStreamReader(stream, Charsets.UTF_8), 8192), new Function1<String, Unit>() { // from class: com.unity3d.ads.core.data.datasource.AndroidUnityBootConfigDataSource$getValue$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(String str2) {
                        invoke2(str2);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull String line) {
                        Intrinsics.checkNotNullParameter(line, "line");
                        if (StringsKt.a0(line, str, false, 2, null)) {
                            Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                            String strSubstring = line.substring(str.length());
                            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                            ref$ObjectRef2.f93280b = strSubstring;
                        }
                    }
                });
                Unit unit = Unit.f93236a;
                c.a(stream, null);
                objB = Result.b((String) ref$ObjectRef.f93280b);
            } finally {
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        return (String) (Result.i(objB) ? null : objB);
    }
}
