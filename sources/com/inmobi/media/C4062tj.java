package com.inmobi.media;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.inmobi.media.C4062tj;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.squareup.picasso.Picasso;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4062tj extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f39604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f39605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4137wj f39606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref$BooleanRef f39607d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ImageView f39608e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bitmap.Config f39609f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4062tj(List list, C4137wj c4137wj, Ref$BooleanRef ref$BooleanRef, ImageView imageView, Bitmap.Config config, Continuation continuation) {
        super(2, continuation);
        this.f39605b = list;
        this.f39606c = c4137wj;
        this.f39607d = ref$BooleanRef;
        this.f39608e = imageView;
        this.f39609f = config;
    }

    public static final void a(C4137wj c4137wj, ImageView imageView, Pair pair) {
        C3903n9 c3903n9 = c4137wj.f39869e;
        if (c3903n9 != null) {
            c3903n9.a("StaticExperienceManager", "loadImagesIntoImageView - setting bitmap to ImageView");
        }
        c4137wj.a(imageView, (Image) pair.getSecond());
        imageView.setImageBitmap((Bitmap) pair.getFirst());
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C4062tj c4062tj = new C4062tj(this.f39605b, this.f39606c, this.f39607d, this.f39608e, this.f39609f, continuation);
        c4062tj.f39604a = obj;
        return c4062tj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4062tj) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws C3655dc {
        final Pair pair;
        Object objB;
        pf.b.g();
        kotlin.d.b(obj);
        List list = this.f39605b;
        C4137wj c4137wj = this.f39606c;
        Bitmap.Config config = this.f39609f;
        Ref$BooleanRef ref$BooleanRef = this.f39607d;
        Iterator it = list.iterator();
        do {
            pair = null;
            if (!it.hasNext()) {
                break;
            }
            Image image = (Image) it.next();
            C3903n9 c3903n9 = c4137wj.f39869e;
            if (c3903n9 != null) {
                c3903n9.a("StaticExperienceManager", "loadImagesIntoImageView - trying to load image from URL: " + image.getUrl());
            }
            try {
                Result.Companion companion = Result.f93230c;
                Picasso picasso = Qf.f37593a;
                objB = Result.b(Qf.b(c4137wj.f38785a).load(image.getUrl()).tag(c4137wj.f39870f).transform(new Lf(config)).get());
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th2));
            }
            Throwable thG = Result.g(objB);
            if (thG != null) {
                C3903n9 c3903n92 = c4137wj.f39869e;
                if (c3903n92 != null) {
                    c3903n92.a("StaticExperienceManager", "Bitmap Failure " + image.getUrl() + " " + thG.getMessage());
                }
                if (thG instanceof C3576ab) {
                    ref$BooleanRef.f93279b = true;
                }
            }
            if (Result.i(objB)) {
                objB = null;
            }
            Bitmap bitmap = (Bitmap) objB;
            if (bitmap != null) {
                pair = new Pair(bitmap, image);
            }
        } while (pair == null);
        if (pair != null) {
            final ImageView imageView = this.f39608e;
            final C4137wj c4137wj2 = this.f39606c;
            return kotlin.coroutines.jvm.internal.b.a(imageView.post(new Runnable() { // from class: w3.ra
                @Override // java.lang.Runnable
                public final void run() {
                    C4062tj.a(c4137wj2, imageView, pair);
                }
            }));
        }
        C3903n9 c3903n93 = this.f39606c.f39869e;
        if (c3903n93 != null) {
            c3903n93.b("StaticExperienceManager", "Bitmap Load Failure - no images could be loaded");
        }
        C4137wj c4137wj3 = this.f39606c;
        boolean z10 = this.f39607d.f93279b;
        c4137wj3.getClass();
        short s10 = z10 ? (short) 81 : (short) 82;
        Map mutableMap = MapsKt.toMutableMap(AbstractC3789ik.a(c4137wj3.f39867c.f39943b.f36742a));
        mutableMap.put("errorCode", Short.valueOf(s10));
        Wj wj = Wj.f37959a;
        Wj.b("MainImageLoadFailure", mutableMap, EnumC3585ak.f38215a);
        throw new C3655dc();
    }
}
