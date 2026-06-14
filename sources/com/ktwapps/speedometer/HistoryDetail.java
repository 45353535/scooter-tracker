package com.ktwapps.speedometer;

import a5.c;
import a5.i;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.media3.common.MimeTypes;
import androidx.webkit.internal.AssetHelper;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import com.ktwapps.speedometer.Database.AppDatabaseObject;
import com.ktwapps.speedometer.HistoryDetail;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import x4.k;
import x4.l;
import x4.x;
import y4.g;
import y4.m;

/* JADX INFO: loaded from: classes10.dex */
public class HistoryDetail extends AppCompatActivity implements OnMapReadyCallback {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    g f46019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    GoogleMap f46020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    c f46021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f46022f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f46023g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f46024h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ValueAnimator f46025i;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (HistoryDetail.this.f46021e.getRoot().getHeight() == 0) {
                return;
            }
            HistoryDetail.this.f46021e.getRoot().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            float f10 = HistoryDetail.this.getResources().getDisplayMetrics().density;
            int height = HistoryDetail.this.f46021e.getRoot().getHeight();
            boolean z10 = HistoryDetail.this.getResources().getConfiguration().orientation == 2;
            ViewGroup.LayoutParams layoutParams = HistoryDetail.this.f46021e.E.getLayoutParams();
            if (z10) {
                layoutParams.height = Math.max((int) (160.0f * f10), Math.min((int) (height * 0.5f), (int) (f10 * 360.0f)));
            } else {
                layoutParams.height = Math.max((int) (160.0f * f10), Math.min((int) (height * 0.45f), (int) (f10 * 400.0f)));
            }
            HistoryDetail.this.f46021e.E.setLayoutParams(layoutParams);
            SupportMapFragment supportMapFragment = (SupportMapFragment) HistoryDetail.this.getSupportFragmentManager().findFragmentById(R.id.detailMapFragment);
            if (supportMapFragment != null) {
                supportMapFragment.getMapAsync(HistoryDetail.this);
            }
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f46027b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f46028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f46029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f46030e;

        b(List list, int i10, long j10, int i11) {
            this.f46027b = list;
            this.f46028c = i10;
            this.f46029d = j10;
            this.f46030e = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HistoryDetail.this.N(this.f46027b, this.f46028c + 1, this.f46029d, this.f46030e, 0L);
        }
    }

    public static /* synthetic */ void E(List list, List list2, Polyline polyline, ValueAnimator valueAnimator) {
        list.add((LatLng) list2.get(((Integer) valueAnimator.getAnimatedValue()).intValue()));
        polyline.setPoints(list);
    }

    public static /* synthetic */ boolean I(Marker marker) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(List list, int i10, long j10, int i11, long j11) {
        if (i10 >= list.size() || this.f46020d == null) {
            return;
        }
        final List list2 = (List) list.get(i10);
        if (list2.size() < 2) {
            N(list, i10 + 1, j10, i11, 0L);
            return;
        }
        long jMax = Math.max(300L, (long) (j10 * (list2.size() / i11)));
        final Polyline polylineAddPolyline = this.f46020d.addPolyline(new PolylineOptions().add((LatLng) list2.get(0)).width(12.0f).color(Color.parseColor("#0A7FFF")).startCap(new RoundCap()).endCap(new RoundCap()).jointType(2));
        final ArrayList arrayList = new ArrayList();
        arrayList.add((LatLng) list2.get(0));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1, list2.size() - 1);
        this.f46025i = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(jMax);
        this.f46025i.setInterpolator(new LinearInterpolator());
        this.f46025i.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: s4.b0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                HistoryDetail.E(arrayList, list2, polylineAddPolyline, valueAnimator);
            }
        });
        this.f46025i.addListener(new b(list, i10, j10, i11));
        if (j11 > 0) {
            this.f46021e.E.postDelayed(new Runnable() { // from class: s4.g0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f99614b.R();
                }
            }, j11);
        } else {
            this.f46025i.start();
        }
    }

    private void Q() {
        this.f46021e.f3823k.post(new Runnable() { // from class: s4.m0
            @Override // java.lang.Runnable
            public final void run() {
                this.f99671b.T();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R() {
        ValueAnimator valueAnimator = this.f46025i;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(Bitmap bitmap) {
        this.f46021e.C.setVisibility(0);
        this.f46021e.D.setImageBitmap(bitmap);
        this.f46021e.f3823k.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimaryBackground));
        ViewCompat.setBackgroundTintList(this.f46021e.f3823k, null);
        ConstraintLayout constraintLayout = this.f46021e.f3823k;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(constraintLayout.getWidth(), constraintLayout.getHeight(), Bitmap.Config.ARGB_8888);
        constraintLayout.draw(new Canvas(bitmapCreateBitmap));
        try {
            f0(c0(bitmapCreateBitmap));
        } catch (Exception e10) {
            e10.printStackTrace();
        } finally {
            this.f46021e.C.setVisibility(4);
            this.f46021e.D.setImageBitmap(null);
            this.f46021e.f3823k.setBackground(ContextCompat.getDrawable(this, R.drawable.background_rounded_16dp));
            ViewCompat.setBackgroundTintList(this.f46021e.f3823k, ColorStateList.valueOf(ContextCompat.getColor(this, R.color.colorPrimaryBackground)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T() {
        GoogleMap googleMap = this.f46020d;
        if (googleMap != null) {
            googleMap.snapshot(new GoogleMap.SnapshotReadyCallback() { // from class: s4.e0
                @Override // com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback
                public final void onSnapshotReady(Bitmap bitmap) {
                    this.f99597a.S(bitmap);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean U(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.f46021e.K.requestDisallowInterceptTouchEvent(false);
                return true;
            }
            if (action != 2) {
                return true;
            }
        }
        this.f46021e.K.requestDisallowInterceptTouchEvent(true);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WindowInsetsCompat V(View view, WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        int i10 = insets.top;
        int i11 = insets.bottom;
        view.setPadding(insets.left, i10, insets.right, 0);
        this.f46021e.K.setPadding(0, 0, 0, i11);
        this.f46021e.K.setClipToPadding(false);
        return WindowInsetsCompat.CONSUMED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(v4.b bVar) {
        if (bVar != null) {
            String strI = bVar.i();
            String strD = bVar.d();
            if (strI == null || strI.isEmpty()) {
                strI = getResources().getString(R.string.address_not_found);
            }
            if (strD == null || strD.isEmpty()) {
                strD = getResources().getString(R.string.address_not_found);
            }
            this.f46021e.Q.setText(bVar.k());
            this.f46021e.f3824l.setText(l.h(bVar.j()));
            this.f46021e.f3836x.setText(l.j(bVar.c()));
            this.f46021e.f3830r.setText(l.m(this, bVar.b()));
            this.f46021e.f3819g.setText(l.n(this, bVar.a()));
            this.f46021e.G.setText(l.n(this, bVar.g()));
            this.f46021e.f3826n.setText(strI);
            this.f46021e.f3828p.setText(l.q(this, bVar.j()));
            this.f46021e.f3814b.setText(strD);
            this.f46021e.f3816d.setText(l.q(this, bVar.e()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(List list) {
        try {
            this.f46021e.E.setVisibility((list == null || list.isEmpty()) ? 8 : 0);
            this.f46024h = list;
            j0(false);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(Integer num) {
        AppDatabaseObject appDatabaseObjectF = AppDatabaseObject.f(this);
        appDatabaseObjectF.g().g(num.intValue());
        appDatabaseObjectF.g().c(num.intValue());
        runOnUiThread(new Runnable() { // from class: s4.f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f99605b.finish();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(final Integer num, DialogInterface dialogInterface, int i10) {
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: s4.c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f99577b.Y(num);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(v4.b bVar, String str) {
        u4.a aVarG = AppDatabaseObject.f(this).g();
        int iF = bVar.f();
        if (str.isEmpty()) {
            str = getResources().getString(R.string.untitled);
        }
        aVarG.d(iF, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b0(i iVar, final v4.b bVar, DialogInterface dialogInterface, int i10) {
        final String strTrim = iVar.f3974b.getText().toString().trim();
        Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: s4.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f99587b.a0(bVar, strTrim);
            }
        });
    }

    private File c0(Bitmap bitmap) throws IOException {
        File file = new File(getCacheDir(), "export");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, "trip_" + System.currentTimeMillis() + ".png");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        return file2;
    }

    private void f0(File file) {
        Uri uriForFile = FileProvider.getUriForFile(this, getPackageName() + ".fileprovider", file);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(MimeTypes.IMAGE_PNG);
        intent.putExtra("android.intent.extra.STREAM", uriForFile);
        intent.addFlags(1);
        startActivity(Intent.createChooser(intent, null));
    }

    private void g0(final Integer num) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.dialog_history_delete_message);
        builder.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: s4.j0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f99642b.Z(num, dialogInterface, i10);
            }
        });
        builder.setNegativeButton(R.string.no, (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        int iIntValue = ((Integer) k.b(this).get(x.d(this))).intValue();
        alertDialogCreate.getButton(-2).setTextColor(iIntValue);
        alertDialogCreate.getButton(-1).setTextColor(iIntValue);
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    private void h0(final v4.b bVar) {
        final i iVarC = i.c(getLayoutInflater());
        iVarC.f3974b.setText(bVar.k());
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(iVarC.getRoot());
        builder.setPositiveButton(R.string.done, new DialogInterface.OnClickListener() { // from class: s4.k0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                this.f99652b.b0(iVarC, bVar, dialogInterface, i10);
            }
        });
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        int iIntValue = ((Integer) k.b(this).get(x.d(this))).intValue();
        alertDialogCreate.getButton(-2).setTextColor(iIntValue);
        alertDialogCreate.getButton(-1).setTextColor(iIntValue);
        if (alertDialogCreate.getWindow() != null) {
            alertDialogCreate.getWindow().setBackgroundDrawableResource(R.drawable.background_dialog_background);
        }
    }

    private void i0(v4.b bVar) {
        List list;
        if (this.f46022f && (list = this.f46024h) != null && !list.isEmpty()) {
            j0(true);
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", l.b(this, bVar));
        startActivity(Intent.createChooser(intent, null));
    }

    private void j0(boolean z10) {
        List list;
        if (!this.f46022f || (list = this.f46024h) == null || list.isEmpty()) {
            return;
        }
        ValueAnimator valueAnimator = this.f46025i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f46025i = null;
        }
        this.f46020d.clear();
        if (!this.f46023g && !z10) {
            P(this.f46024h, 250L);
            this.f46023g = true;
        } else {
            O(this.f46024h);
            if (z10) {
                Q();
            }
        }
    }

    public void O(List list) {
        if (this.f46020d == null || list == null || list.isEmpty()) {
            return;
        }
        ArrayList<List> arrayList = new ArrayList();
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        arrayList.add(new ArrayList());
        int iC = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            v4.a aVar = (v4.a) list.get(i10);
            if (iC != aVar.c()) {
                iC = aVar.c();
                arrayList.add(new ArrayList());
            }
            LatLng latLng = new LatLng(aVar.b(), aVar.d());
            builder.include(latLng);
            ((List) arrayList.get(arrayList.size() - 1)).add(latLng);
        }
        for (List list2 : arrayList) {
            if (list2.size() >= 2) {
                this.f46020d.addPolyline(new PolylineOptions().addAll(list2).width(12.0f).color(Color.parseColor("#0A7FFF")).startCap(new RoundCap()).endCap(new RoundCap()).jointType(2));
            }
        }
        this.f46020d.moveCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), (int) (Math.min(this.f46021e.E.getWidth(), this.f46021e.E.getHeight()) * 0.15f)));
        LatLng latLng2 = new LatLng(((v4.a) list.get(0)).b(), ((v4.a) list.get(0)).d());
        BitmapDescriptor bitmapDescriptorA = l.a(this, R.drawable.ic_depart);
        if (bitmapDescriptorA != null) {
            this.f46020d.addMarker(new MarkerOptions().anchor(0.5f, 0.5f).position(latLng2).icon(bitmapDescriptorA));
        }
        LatLng latLng3 = new LatLng(((v4.a) list.get(list.size() - 1)).b(), ((v4.a) list.get(list.size() - 1)).d());
        BitmapDescriptor bitmapDescriptorA2 = l.a(this, R.drawable.ic_arrive);
        if (bitmapDescriptorA2 != null) {
            this.f46020d.addMarker(new MarkerOptions().anchor(0.5f, 0.5f).position(latLng3).icon(bitmapDescriptorA2));
        }
    }

    public void P(List list, long j10) {
        if (this.f46020d == null || list == null || list.isEmpty()) {
            return;
        }
        ArrayList<List> arrayList = new ArrayList();
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        arrayList.add(new ArrayList());
        int iC = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            v4.a aVar = (v4.a) list.get(i10);
            if (iC != aVar.c()) {
                iC = aVar.c();
                arrayList.add(new ArrayList());
            }
            LatLng latLng = new LatLng(aVar.b(), aVar.d());
            builder.include(latLng);
            ((List) arrayList.get(arrayList.size() - 1)).add(latLng);
        }
        this.f46020d.moveCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), (int) (Math.min(this.f46021e.E.getWidth(), this.f46021e.E.getHeight()) * 0.15f)));
        LatLng latLng2 = new LatLng(((v4.a) list.get(0)).b(), ((v4.a) list.get(0)).d());
        BitmapDescriptor bitmapDescriptorA = l.a(this, R.drawable.ic_depart);
        if (bitmapDescriptorA != null) {
            this.f46020d.addMarker(new MarkerOptions().anchor(0.5f, 0.5f).position(latLng2).icon(bitmapDescriptorA));
        }
        LatLng latLng3 = new LatLng(((v4.a) list.get(list.size() - 1)).b(), ((v4.a) list.get(list.size() - 1)).d());
        BitmapDescriptor bitmapDescriptorA2 = l.a(this, R.drawable.ic_arrive);
        if (bitmapDescriptorA2 != null) {
            this.f46020d.addMarker(new MarkerOptions().anchor(0.5f, 0.5f).position(latLng3).icon(bitmapDescriptorA2));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = 0;
        for (List list2 : arrayList) {
            if (list2.size() >= 2) {
                arrayList2.add(list2);
                size += list2.size();
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        N(arrayList2, 0, Math.min((((long) size) * 5) + 1200, 3500L), size, j10);
    }

    public void d0() {
        setSupportActionBar(this.f46021e.R);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(R.string.detail);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        this.f46021e.D.setOnTouchListener(new View.OnTouchListener() { // from class: s4.n0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f99676b.U(view, motionEvent);
            }
        });
        this.f46021e.getRoot().getViewTreeObserver().addOnGlobalLayoutListener(new a());
        if (Build.VERSION.SDK_INT >= 35) {
            ViewCompat.setOnApplyWindowInsetsListener(this.f46021e.getRoot(), new OnApplyWindowInsetsListener() { // from class: s4.o0
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                    return this.f99682b.V(view, windowInsetsCompat);
                }
            });
        }
    }

    public void e0() {
        g gVar = (g) new ViewModelProvider(this, new m(getApplication(), getIntent().getIntExtra("id", -1))).get(g.class);
        this.f46019c = gVar;
        gVar.f108359b.observe(this, new Observer() { // from class: s4.h0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f99624b.W((v4.b) obj);
            }
        });
        this.f46019c.f108360c.observe(this, new Observer() { // from class: s4.i0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f99633b.X((List) obj);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c cVarC = c.c(LayoutInflater.from(this));
        this.f46021e = cVarC;
        setContentView(cVarC.getRoot());
        d0();
        e0();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_history_detail, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        ValueAnimator valueAnimator = this.f46025i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f46025i = null;
        }
        super.onDestroy();
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public void onMapReady(GoogleMap googleMap) {
        this.f46020d = googleMap;
        googleMap.setMapColorScheme(x.l(this) == 0 ? 1 : 0);
        this.f46020d.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() { // from class: s4.l0
            @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
            public final boolean onMarkerClick(Marker marker) {
                return HistoryDetail.I(marker);
            }
        });
        this.f46020d.getUiSettings().setZoomControlsEnabled(false);
        this.f46022f = true;
        j0(false);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int intExtra = getIntent().getIntExtra("id", -1);
        v4.b bVar = (v4.b) this.f46019c.f108359b.getValue();
        if (intExtra == -1 || bVar == null) {
            return true;
        }
        if (menuItem.getItemId() == R.id.menu_share) {
            i0(bVar);
            return false;
        }
        if (menuItem.getItemId() == R.id.menu_delete) {
            g0(Integer.valueOf(intExtra));
            return false;
        }
        if (menuItem.getItemId() != R.id.menu_edit) {
            return false;
        }
        h0(bVar);
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatActivity
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
