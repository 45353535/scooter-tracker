package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public interface zzcjl extends com.google.android.gms.ads.internal.client.zza, zzdjm, zzcjc, zzbrd, zzcks, zzckx, zzbrp, zzbde, zzclb, com.google.android.gms.ads.internal.zzn, zzcle, zzclf, zzcge, zzclg {
    boolean canGoBack();

    void destroy();

    @Override // com.google.android.gms.internal.ads.zzckx, com.google.android.gms.internal.ads.zzcge
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    boolean isAttachedToWindow();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i10, int i11);

    void onPause();

    void onResume();

    @Override // com.google.android.gms.internal.ads.zzcge
    void setBackgroundColor(int i10);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    @Override // com.google.android.gms.internal.ads.zzcjc
    zzfir zzC();

    WebView zzD();

    @Override // com.google.android.gms.internal.ads.zzclg
    View zzE();

    List zzF();

    void zzG();

    void zzH(int i10);

    void zzI();

    void zzJ();

    Context zzK();

    com.google.android.gms.ads.internal.overlay.zzm zzL();

    com.google.android.gms.ads.internal.overlay.zzm zzM();

    @Override // com.google.android.gms.internal.ads.zzcld
    zzclv zzN();

    String zzO();

    zzclj zzP();

    WebViewClient zzQ();

    boolean zzR();

    @Override // com.google.android.gms.internal.ads.zzcle
    zzazh zzS();

    zzfjo zzT();

    zzekb zzU();

    zzejz zzV();

    boolean zzW();

    boolean zzX();

    void zzY();

    boolean zzZ();

    boolean zzaA(boolean z10, int i10);

    boolean zzaB();

    @Override // com.google.android.gms.internal.ads.zzcks
    zzfiu zzaC();

    void zzaD(zzfir zzfirVar, zzfiu zzfiuVar);

    void zzaE(boolean z10);

    ListenableFuture zzaF();

    void zzaG(boolean z10);

    boolean zzaa();

    void zzab(String str, zzboh zzbohVar);

    void zzac(String str, zzboh zzbohVar);

    void zzad(String str, Predicate predicate);

    void zzae(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzaf(zzclv zzclvVar);

    void zzag(boolean z10);

    void zzah();

    void zzai(Context context);

    void zzaj(boolean z10);

    void zzak(zzekb zzekbVar);

    void zzal(zzejz zzejzVar);

    void zzam(int i10);

    void zzan(com.google.android.gms.ads.internal.overlay.zzm zzmVar);

    void zzao(boolean z10);

    void zzap();

    void zzaq(zzbkf zzbkfVar);

    zzbkf zzar();

    void zzas(boolean z10);

    void zzat();

    void zzau(String str, String str2, String str3);

    void zzav();

    void zzaw(boolean z10);

    void zzax(zzbkc zzbkcVar);

    void zzay(zzber zzberVar);

    zzber zzaz();

    @Override // com.google.android.gms.internal.ads.zzcge
    zzckr zzh();

    @Override // com.google.android.gms.internal.ads.zzckx, com.google.android.gms.internal.ads.zzcge
    Activity zzj();

    @Override // com.google.android.gms.internal.ads.zzcge
    com.google.android.gms.ads.internal.zza zzk();

    @Override // com.google.android.gms.internal.ads.zzcge
    zzbhr zzq();

    @Override // com.google.android.gms.internal.ads.zzclf, com.google.android.gms.internal.ads.zzcge
    VersionInfoParcel zzs();

    @Override // com.google.android.gms.internal.ads.zzcge
    void zzt(String str, zzchr zzchrVar);

    @Override // com.google.android.gms.internal.ads.zzcge
    void zzw(zzckr zzckrVar);
}
