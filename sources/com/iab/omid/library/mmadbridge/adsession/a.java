package com.iab.omid.library.mmadbridge.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.mmadbridge.internal.c;
import com.iab.omid.library.mmadbridge.internal.e;
import com.iab.omid.library.mmadbridge.internal.f;
import com.iab.omid.library.mmadbridge.internal.i;
import com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher;
import com.iab.omid.library.mmadbridge.publisher.b;
import com.iab.omid.library.mmadbridge.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f35404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f35405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f35406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.weakreference.a f35407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f35408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f35409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f35410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f35411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f35412i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35413j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f35414k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f35412i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f35413j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f35410g) {
            return;
        }
        this.f35406c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f35407d.get();
    }

    public List<e> d() {
        return this.f35406c.a();
    }

    public boolean e() {
        return this.f35414k != null;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f35410g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f35409f && !this.f35410g;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void finish() {
        if (this.f35410g) {
            return;
        }
        this.f35407d.clear();
        removeAllFriendlyObstructions();
        this.f35410g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f35408e = null;
        this.f35414k = null;
    }

    public boolean g() {
        return this.f35410g;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public String getAdSessionId() {
        return this.f35411h;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f35408e;
    }

    public boolean h() {
        return this.f35405b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f35405b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f35409f;
    }

    void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f35412i = true;
    }

    void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f35413j = true;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f35410g) {
            return;
        }
        g.a(view, "AdView is null");
        if (c() == view) {
            return;
        }
        b(view);
        getAdSessionStatePublisher().a();
        a(view);
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f35410g) {
            return;
        }
        this.f35406c.b();
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f35410g) {
            return;
        }
        this.f35406c.c(view);
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f35414k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.mmadbridge.adsession.AdSession
    public void start() {
        if (this.f35409f) {
            return;
        }
        this.f35409f = true;
        c.c().c(this);
        this.f35408e.a(i.c().b());
        this.f35408e.a(com.iab.omid.library.mmadbridge.internal.a.a().b());
        this.f35408e.a(this, this.f35404a);
    }

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f35406c = new f();
        this.f35409f = false;
        this.f35410g = false;
        this.f35405b = adSessionConfiguration;
        this.f35404a = adSessionContext;
        this.f35411h = str;
        b(null);
        this.f35408e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.mmadbridge.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f35408e.i();
        c.c().a(this);
        this.f35408e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f35407d.clear();
            }
        }
    }

    private void b(View view) {
        this.f35407d = new com.iab.omid.library.mmadbridge.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.mmadbridge.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.mmadbridge.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f35414k.onPossibleObstructionsDetected(this.f35411h, arrayList);
        }
    }

    void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f35413j = true;
    }
}
