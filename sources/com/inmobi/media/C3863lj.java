package com.inmobi.media;

import android.graphics.Bitmap;
import com.inmobi.media.C3863lj;
import com.squareup.picasso.Picasso;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.lj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3863lj extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f38986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Cj f38987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3913nj f38988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f38989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Bitmap.Config f38990e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3863lj(Cj cj, C3913nj c3913nj, String str, Bitmap.Config config, Continuation continuation) {
        super(2, continuation);
        this.f38987b = cj;
        this.f38988c = c3913nj;
        this.f38989d = str;
        this.f38990e = config;
    }

    public static final void a(Cj cj, Bitmap bitmap) {
        cj.setImageBitmap(bitmap);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C3863lj c3863lj = new C3863lj(this.f38987b, this.f38988c, this.f38989d, this.f38990e, continuation);
        c3863lj.f38986a = obj;
        return c3863lj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3863lj) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws C3629cc {
        Object objB;
        C3903n9 c3903n9;
        pf.b.g();
        kotlin.d.b(obj);
        C3913nj c3913nj = this.f38988c;
        String str = this.f38989d;
        Bitmap.Config config = this.f38990e;
        try {
            Result.Companion companion = Result.f93230c;
            Picasso picasso = Qf.f37593a;
            objB = Result.b(Qf.b(c3913nj.f39112a).load(str).tag(c3913nj.f39114c).transform(new Lf(config)).get());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        C3913nj c3913nj2 = this.f38988c;
        Throwable thG = Result.g(objB);
        if (thG != null && (c3903n9 = c3913nj2.f39113b) != null) {
            c3903n9.b("StaticCompanionLoader", "Companion Load Exception: " + thG.getMessage());
        }
        if (Result.i(objB)) {
            objB = null;
        }
        final Bitmap bitmap = (Bitmap) objB;
        if (bitmap == null) {
            throw new C3629cc("Companion Load Error");
        }
        final Cj cj = this.f38987b;
        return kotlin.coroutines.jvm.internal.b.a(cj.post(new Runnable() { // from class: w3.v9
            @Override // java.lang.Runnable
            public final void run() {
                C3863lj.a(cj, bitmap);
            }
        }));
    }
}
