package com.iab.omid.library.bigosg.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bigosg.b.c;
import com.iab.omid.library.bigosg.b.f;
import com.iab.omid.library.bigosg.d.e;
import com.iab.omid.library.bigosg.publisher.AdSessionStatePublisher;
import com.iab.omid.library.bigosg.publisher.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f34493a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionContext f34494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdSessionConfiguration f34495c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bigosg.e.a f34497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AdSessionStatePublisher f34498f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f34503k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<c> f34496d = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f34499g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f34500h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f34501i = UUID.randomUUID().toString();

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f34495c = adSessionConfiguration;
        this.f34494b = adSessionContext;
        c(null);
        this.f34498f = adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML ? new com.iab.omid.library.bigosg.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f34498f.a();
        com.iab.omid.library.bigosg.b.a.a().a(this);
        this.f34498f.a(adSessionConfiguration);
    }

    private c a(View view) {
        for (c cVar : this.f34496d) {
            if (cVar.a().get() == view) {
                return cVar;
            }
        }
        return null;
    }

    private void j() {
        if (this.f34502j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void k() {
        if (this.f34503k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void addFriendlyObstruction(View view) {
        addFriendlyObstruction(view, FriendlyObstructionPurpose.OTHER, null);
    }

    void b() {
        j();
        getAdSessionStatePublisher().g();
        this.f34502j = true;
    }

    void c() {
        k();
        getAdSessionStatePublisher().h();
        this.f34503k = true;
    }

    public View d() {
        return this.f34497e.get();
    }

    public boolean e() {
        return this.f34499g && !this.f34500h;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f34500h) {
            throw new IllegalStateException("AdSession is finished");
        }
        e.a(errorType, "Error type is null");
        e.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f34499g;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void finish() {
        if (this.f34500h) {
            return;
        }
        this.f34497e.clear();
        removeAllFriendlyObstructions();
        this.f34500h = true;
        getAdSessionStatePublisher().f();
        com.iab.omid.library.bigosg.b.a.a().c(this);
        getAdSessionStatePublisher().b();
        this.f34498f = null;
    }

    public boolean g() {
        return this.f34500h;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public String getAdSessionId() {
        return this.f34501i;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f34498f;
    }

    public boolean h() {
        return this.f34495c.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f34495c.isNativeMediaEventsOwner();
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f34500h) {
            return;
        }
        e.a(view, "AdView is null");
        if (d() == view) {
            return;
        }
        c(view);
        getAdSessionStatePublisher().i();
        d(view);
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f34500h) {
            return;
        }
        this.f34496d.clear();
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f34500h) {
            return;
        }
        b(view);
        c cVarA = a(view);
        if (cVarA != null) {
            this.f34496d.remove(cVarA);
        }
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void start() {
        if (this.f34499g) {
            return;
        }
        this.f34499g = true;
        com.iab.omid.library.bigosg.b.a.a().b(this);
        this.f34498f.a(f.a().d());
        this.f34498f.a(this, this.f34494b);
    }

    private void b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void c(View view) {
        this.f34497e = new com.iab.omid.library.bigosg.e.a(view);
    }

    private void d(View view) {
        Collection<a> collectionB = com.iab.omid.library.bigosg.b.a.a().b();
        if (collectionB == null || collectionB.size() <= 0) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.d() == view) {
                aVar.f34497e.clear();
            }
        }
    }

    public List<c> a() {
        return this.f34496d;
    }

    @Override // com.iab.omid.library.bigosg.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f34500h) {
            return;
        }
        b(view);
        a(str);
        if (a(view) == null) {
            this.f34496d.add(new c(view, friendlyObstructionPurpose, str));
        }
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50 || !f34493a.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
            }
        }
    }

    void a(@NonNull JSONObject jSONObject) {
        k();
        getAdSessionStatePublisher().a(jSONObject);
        this.f34503k = true;
    }
}
