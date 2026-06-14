package com.iab.omid.library.corpmailru.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.corpmailru.b.c;
import com.iab.omid.library.corpmailru.b.f;
import com.iab.omid.library.corpmailru.d.e;
import com.iab.omid.library.corpmailru.publisher.AdSessionStatePublisher;
import com.iab.omid.library.corpmailru.publisher.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f34884a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionContext f34885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdSessionConfiguration f34886c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.corpmailru.e.a f34888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AdSessionStatePublisher f34889f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34893j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f34894k;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<c> f34887d = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f34890g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f34891h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f34892i = UUID.randomUUID().toString();

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f34886c = adSessionConfiguration;
        this.f34885b = adSessionContext;
        c(null);
        this.f34889f = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.corpmailru.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f34889f.a();
        com.iab.omid.library.corpmailru.b.a.a().a(this);
        this.f34889f.a(adSessionConfiguration);
    }

    private c a(View view) {
        for (c cVar : this.f34887d) {
            if (cVar.a().get() == view) {
                return cVar;
            }
        }
        return null;
    }

    private void j() {
        if (this.f34893j) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void k() {
        if (this.f34894k) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f34891h) {
            return;
        }
        b(view);
        a(str);
        if (a(view) == null) {
            this.f34887d.add(new c(view, friendlyObstructionPurpose, str));
        }
    }

    void b() {
        j();
        getAdSessionStatePublisher().g();
        this.f34893j = true;
    }

    void c() {
        k();
        getAdSessionStatePublisher().h();
        this.f34894k = true;
    }

    public View d() {
        return this.f34888e.get();
    }

    public boolean e() {
        return this.f34890g && !this.f34891h;
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f34891h) {
            throw new IllegalStateException("AdSession is finished");
        }
        e.a(errorType, "Error type is null");
        e.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f34890g;
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void finish() {
        if (this.f34891h) {
            return;
        }
        this.f34888e.clear();
        removeAllFriendlyObstructions();
        this.f34891h = true;
        getAdSessionStatePublisher().f();
        com.iab.omid.library.corpmailru.b.a.a().c(this);
        getAdSessionStatePublisher().b();
        this.f34889f = null;
    }

    public boolean g() {
        return this.f34891h;
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public String getAdSessionId() {
        return this.f34892i;
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f34889f;
    }

    public boolean h() {
        return this.f34886c.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f34886c.isNativeMediaEventsOwner();
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f34891h) {
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

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f34891h) {
            return;
        }
        this.f34887d.clear();
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f34891h) {
            return;
        }
        b(view);
        c cVarA = a(view);
        if (cVarA != null) {
            this.f34887d.remove(cVarA);
        }
    }

    @Override // com.iab.omid.library.corpmailru.adsession.AdSession
    public void start() {
        if (this.f34890g) {
            return;
        }
        this.f34890g = true;
        com.iab.omid.library.corpmailru.b.a.a().b(this);
        this.f34889f.a(f.a().d());
        this.f34889f.a(this, this.f34885b);
    }

    private static void b(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void c(View view) {
        this.f34888e = new com.iab.omid.library.corpmailru.e.a(view);
    }

    private void d(View view) {
        Collection<a> collectionB = com.iab.omid.library.corpmailru.b.a.a().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.d() == view) {
                aVar.f34888e.clear();
            }
        }
    }

    public List<c> a() {
        return this.f34887d;
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50 || !f34884a.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
            }
        }
    }

    void a(@NonNull JSONObject jSONObject) {
        k();
        getAdSessionStatePublisher().a(jSONObject);
        this.f34894k = true;
    }
}
