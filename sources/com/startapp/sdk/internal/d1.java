package com.startapp.sdk.internal;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.banner3d.Banner3D;
import com.startapp.sdk.ads.banner.banner3d.Banner3DView;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class d1 implements j2, Parcelable {
    public static final Parcelable.Creator<d1> CREATOR = new c1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdDetails f64390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Point f64391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f64392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bitmap f64393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f64394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TrackingParams f64395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ag f64396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Banner3DView f64397h;

    public d1(Context context, Banner3D banner3D, AdDetails adDetails, BannerOptions bannerOptions, TrackingParams trackingParams) {
        this.f64392c = null;
        this.f64393d = null;
        this.f64394e = new AtomicBoolean(false);
        this.f64396g = null;
        this.f64397h = null;
        this.f64390a = adDetails;
        this.f64395f = trackingParams;
        a(context, bannerOptions, banner3D);
    }

    public final void a(Context context, BannerOptions bannerOptions, Banner3D banner3D) {
        int iA = li.a(context, bannerOptions.d() - 5);
        this.f64391b = new Point((int) (bannerOptions.p() * Math.round(TypedValue.applyDimension(1, bannerOptions.o(), context.getResources().getDisplayMetrics()))), (int) (bannerOptions.e() * Math.round(TypedValue.applyDimension(1, bannerOptions.d(), context.getResources().getDisplayMetrics()))));
        Banner3DView banner3DView = new Banner3DView(context, new Point(bannerOptions.o(), bannerOptions.d()));
        this.f64397h = banner3DView;
        banner3DView.setText(this.f64390a.x());
        this.f64397h.setRating(this.f64390a.u());
        this.f64397h.setDescription(this.f64390a.j());
        this.f64397h.setButtonText(this.f64390a.C());
        Bitmap bitmap = this.f64392c;
        if (bitmap != null) {
            this.f64397h.setImage(bitmap, iA, iA);
        } else {
            this.f64397h.setImage(R.drawable.sym_def_app_icon, iA, iA);
            new k2(context, this.f64390a.m(), this, 0).a();
        }
        Point point = this.f64391b;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(point.x, point.y);
        layoutParams.addRule(13);
        banner3D.addView(this.f64397h, layoutParams);
        this.f64397h.setVisibility(8);
        a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f64390a, i10);
        parcel.writeInt(this.f64391b.x);
        parcel.writeInt(this.f64391b.y);
        parcel.writeParcelable(this.f64392c, i10);
        parcel.writeBooleanArray(new boolean[]{this.f64394e.get()});
        parcel.writeSerializable(this.f64395f);
    }

    public d1(Parcel parcel) {
        this.f64392c = null;
        this.f64393d = null;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f64394e = atomicBoolean;
        this.f64396g = null;
        this.f64397h = null;
        this.f64390a = (AdDetails) parcel.readParcelable(AdDetails.class.getClassLoader());
        Point point = new Point(1, 1);
        this.f64391b = point;
        point.x = parcel.readInt();
        this.f64391b.y = parcel.readInt();
        this.f64392c = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        atomicBoolean.set(zArr[0]);
        this.f64395f = (TrackingParams) parcel.readSerializable();
    }

    public final void a() {
        Bitmap bitmapA;
        Point point;
        int i10;
        int i11;
        Banner3DView banner3DView = this.f64397h;
        if (banner3DView != null) {
            try {
                bitmapA = a(banner3DView);
            } catch (OutOfMemoryError unused) {
                bitmapA = null;
            } catch (Throwable th2) {
                g9.a(th2);
                bitmapA = null;
            }
        } else {
            bitmapA = null;
        }
        this.f64393d = bitmapA;
        if (bitmapA != null && (i10 = (point = this.f64391b).x) > 0 && (i11 = point.y) > 0) {
            this.f64393d = Bitmap.createScaledBitmap(bitmapA, i10, i11, false);
        }
    }

    public static Bitmap a(View view) {
        view.measure(view.getMeasuredWidth(), view.getMeasuredHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Override // com.startapp.sdk.internal.j2
    public final void a(Bitmap bitmap, int i10) {
        Banner3DView banner3DView;
        if (bitmap == null || (banner3DView = this.f64397h) == null) {
            return;
        }
        this.f64392c = bitmap;
        banner3DView.setImage(bitmap);
        a();
    }
}
