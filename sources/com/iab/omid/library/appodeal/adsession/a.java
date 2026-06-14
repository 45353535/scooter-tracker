package com.iab.omid.library.appodeal.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.appodeal.internal.c;
import com.iab.omid.library.appodeal.internal.e;
import com.iab.omid.library.appodeal.internal.f;
import com.iab.omid.library.appodeal.internal.i;
import com.iab.omid.library.appodeal.publisher.AdSessionStatePublisher;
import com.iab.omid.library.appodeal.publisher.b;
import com.iab.omid.library.appodeal.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f34352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f34353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f34354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.appodeal.weakreference.a f34355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f34356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f34357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f34358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f34359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34361j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f34362k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f34360i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f34361j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f34358g) {
            return;
        }
        this.f34354c.a(view, friendlyObstructionPurpose, str);
    }

    public String c() {
        return this.f34359h;
    }

    public AdSessionStatePublisher d() {
        return this.f34356e;
    }

    public View e() {
        return this.f34355d.get();
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f34358g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        d().a(errorType, str);
    }

    public List<e> f() {
        return this.f34354c.a();
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void finish() {
        if (this.f34358g) {
            return;
        }
        this.f34355d.clear();
        removeAllFriendlyObstructions();
        this.f34358g = true;
        d().f();
        c.c().b(this);
        d().b();
        this.f34356e = null;
        this.f34362k = null;
    }

    public boolean g() {
        return this.f34362k != null;
    }

    public boolean h() {
        return this.f34357f && !this.f34358g;
    }

    public boolean i() {
        return this.f34358g;
    }

    public boolean j() {
        return this.f34353b.isNativeImpressionOwner();
    }

    public boolean k() {
        return this.f34353b.isNativeMediaEventsOwner();
    }

    public boolean l() {
        return this.f34357f;
    }

    void m() {
        a();
        d().g();
        this.f34360i = true;
    }

    void n() {
        b();
        d().h();
        this.f34361j = true;
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void registerAdView(@Nullable View view) {
        if (this.f34358g || e() == view) {
            return;
        }
        b(view);
        d().a();
        a(view);
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f34358g) {
            return;
        }
        this.f34354c.b();
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f34358g) {
            return;
        }
        this.f34354c.c(view);
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f34362k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.appodeal.adsession.AdSession
    public void start() {
        if (this.f34357f || this.f34356e == null) {
            return;
        }
        this.f34357f = true;
        c.c().c(this);
        this.f34356e.a(i.c().b());
        this.f34356e.a(com.iab.omid.library.appodeal.internal.a.a().b());
        this.f34356e.a(this, this.f34352a);
    }

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f34354c = new f();
        this.f34357f = false;
        this.f34358g = false;
        this.f34353b = adSessionConfiguration;
        this.f34352a = adSessionContext;
        this.f34359h = str;
        b(null);
        this.f34356e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.appodeal.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f34356e.i();
        c.c().a(this);
        this.f34356e.a(adSessionConfiguration);
    }

    private void a(@Nullable View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.e() == view) {
                aVar.f34355d.clear();
            }
        }
    }

    private void b(@Nullable View view) {
        this.f34355d = new com.iab.omid.library.appodeal.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.appodeal.weakreference.a> list) {
        if (g()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.appodeal.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f34362k.onPossibleObstructionsDetected(this.f34359h, arrayList);
        }
    }

    void a(@NonNull JSONObject jSONObject) {
        b();
        d().a(jSONObject);
        this.f34361j = true;
    }
}
