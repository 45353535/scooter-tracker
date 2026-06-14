package com.iab.omid.library.taurusx.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.taurusx.internal.c;
import com.iab.omid.library.taurusx.internal.e;
import com.iab.omid.library.taurusx.internal.h;
import com.iab.omid.library.taurusx.publisher.AdSessionStatePublisher;
import com.iab.omid.library.taurusx.publisher.b;
import com.iab.omid.library.taurusx.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f36079l = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f36080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f36081b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.taurusx.weakreference.a f36083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f36084e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f36088i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f36089j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f36090k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<e> f36082c = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f36085f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36086g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f36087h = UUID.randomUUID().toString();

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this.f36081b = adSessionConfiguration;
        this.f36080a = adSessionContext;
        d(null);
        this.f36084e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.taurusx.publisher.a(adSessionContext.getWebView()) : new b(adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f36084e.i();
        c.c().a(this);
        this.f36084e.a(adSessionConfiguration);
    }

    private void a() {
        if (this.f36088i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private e b(View view) {
        for (e eVar : this.f36082c) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    @Override // com.iab.omid.library.taurusx.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f36086g) {
            return;
        }
        a(view);
        a(str);
        if (b(view) == null) {
            this.f36082c.add(new e(view, friendlyObstructionPurpose, str));
        }
    }

    public View c() {
        return this.f36083d.get();
    }

    public List<e> d() {
        return this.f36082c;
    }

    public boolean e() {
        return this.f36090k != null;
    }

    @Override // com.iab.omid.library.taurusx.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f36086g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f36085f && !this.f36086g;
    }

    @Override // com.iab.omid.library.taurusx.adsession.AdSession
    public void finish() {
        if (this.f36086g) {
            return;
        }
        this.f36083d.clear();
        removeAllFriendlyObstructions();
        this.f36086g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f36084e = null;
        this.f36090k = null;
    }

    public boolean g() {
        return this.f36086g;
    }

    @Override // com.iab.omid.library.taurusx.adsession.AdSession
    public String getAdSessionId() {
        return this.f36087h;
    }

    @Override // com.iab.omid.library.taurusx.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f36084e;
    }

    public boolean h() {
        return this.f36081b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f36081b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f36085f;
    }

    void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f36088i = true;
    }

    void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f36089j = true;
    }

    @Override // com.iab.omid.library.taurusx.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f36086g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        d(view);
        getAdSessionStatePublisher().a();
        c(view);
    }

    @Override // com.iab.omid.library.taurusx.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f36086g) {
            return;
        }
        this.f36082c.clear();
    }

    @Override // com.iab.omid.library.taurusx.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f36086g) {
            return;
        }
        a(view);
        e eVarB = b(view);
        if (eVarB != null) {
            this.f36082c.remove(eVarB);
        }
    }

    @Override // com.iab.omid.library.taurusx.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f36090k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.taurusx.adsession.AdSession
    public void start() {
        if (this.f36085f) {
            return;
        }
        this.f36085f = true;
        c.c().c(this);
        this.f36084e.a(h.c().b());
        this.f36084e.a(com.iab.omid.library.taurusx.internal.a.a().b());
        this.f36084e.a(this, this.f36080a);
    }

    private static void a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void b() {
        if (this.f36089j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void c(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f36083d.clear();
            }
        }
    }

    private void d(View view) {
        this.f36083d = new com.iab.omid.library.taurusx.weakreference.a(view);
    }

    private void a(String str) {
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f36079l.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
    }

    public void a(List<com.iab.omid.library.taurusx.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.taurusx.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f36090k.onPossibleObstructionsDetected(this.f36087h, arrayList);
        }
    }

    void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f36089j = true;
    }
}
