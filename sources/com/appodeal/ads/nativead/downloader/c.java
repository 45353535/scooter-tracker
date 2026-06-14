package com.appodeal.ads.nativead.downloader;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import com.appodeal.ads.ImageData;
import com.appodeal.ads.ext.ResultExtKt;
import com.appodeal.ads.j2;
import com.appodeal.ads.utils.Log;
import com.ironsource.Sd;
import java.io.File;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ImageData f13855r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f13856s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f13857t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ImageData imageData, g gVar, boolean z10, Continuation continuation) {
        super(2, continuation);
        this.f13855r = imageData;
        this.f13856s = gVar;
        this.f13857t = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f13855r, this.f13856s, this.f13857t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objB;
        Object objB2;
        Object localUri;
        pf.b.g();
        kotlin.d.b(obj);
        ImageData imageData = this.f13855r;
        File file = null;
        if (!(imageData instanceof ImageData.Remote)) {
            if (imageData != null) {
                return Result.a(ResultExtKt.asSuccess(imageData));
            }
            return null;
        }
        n nVar = (n) this.f13856s.f13863b.getValue();
        String url = ((ImageData.Remote) this.f13855r).getRemoteUrl();
        boolean z10 = this.f13857t;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Result.Companion companion = Result.f93230c;
            BitmapFactory.Options options = new BitmapFactory.Options();
            int i10 = 1;
            options.inJustDecodeBounds = true;
            Point pointX = j2.x(nVar.f13868a);
            Intrinsics.checkNotNullExpressionValue(pointX, "getScreenSize(...)");
            int iMin = Math.min(Sd.c.f41756d, Math.min(pointX.x, pointX.y));
            int i11 = z10 ? (int) (iMin / 1.5f) : iMin;
            if (i11 > 700) {
                i11 = 700;
            }
            int i12 = options.outWidth;
            int i13 = options.outHeight;
            while (true) {
                if (i12 / i10 <= iMin && i13 / i10 <= i11) {
                    break;
                }
                i10 *= 2;
            }
            Context context = nVar.f13868a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            try {
                file = new File(m.a(context), m.d(url));
            } catch (Exception e10) {
                Log.log(e10);
            }
            Object objA = n.a(file, z10, options);
            if (objA == null) {
                objA = n.b(url, file, z10, options, i10);
            }
            objB = Result.b(objA);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        g gVar = this.f13856s;
        if (Result.j(objB)) {
            l lVar = (l) objB;
            if (lVar instanceof j) {
                localUri = new ImageData.LocalDrawable(new BitmapDrawable(gVar.f13862a.getResources(), ((j) lVar).f13866a));
            } else {
                if (!(lVar instanceof k)) {
                    throw new lf.m();
                }
                Uri uri = Uri.parse(((k) lVar).f13867a);
                Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                localUri = new ImageData.LocalUri(uri);
            }
            objB2 = Result.b(localUri);
        } else {
            objB2 = Result.b(objB);
        }
        return Result.a(objB2);
    }
}
