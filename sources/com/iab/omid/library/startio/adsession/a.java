package com.iab.omid.library.startio.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.startio.internal.c;
import com.iab.omid.library.startio.internal.e;
import com.iab.omid.library.startio.internal.f;
import com.iab.omid.library.startio.internal.i;
import com.iab.omid.library.startio.publisher.AdSessionStatePublisher;
import com.iab.omid.library.startio.publisher.b;
import com.iab.omid.library.startio.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f35950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f35951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f35952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.startio.weakreference.a f35953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f35954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f35955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f35956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f35957h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f35958i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f35959j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f35960k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f35958i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f35959j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f35956g) {
            return;
        }
        this.f35952c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f35953d.get();
    }

    public List<e> d() {
        return this.f35952c.a();
    }

    public boolean e() {
        return this.f35960k != null;
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f35956g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f35955f && !this.f35956g;
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void finish() {
        if (this.f35956g) {
            return;
        }
        this.f35953d.clear();
        removeAllFriendlyObstructions();
        this.f35956g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f35954e = null;
        this.f35960k = null;
    }

    public boolean g() {
        return this.f35956g;
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public String getAdSessionId() {
        return this.f35957h;
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f35954e;
    }

    public boolean h() {
        return this.f35951b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f35951b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f35955f;
    }

    void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f35958i = true;
    }

    void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f35959j = true;
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f35956g) {
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

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f35956g) {
            return;
        }
        this.f35952c.b();
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f35956g) {
            return;
        }
        this.f35952c.c(view);
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f35960k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.startio.adsession.AdSession
    public void start() {
        if (this.f35955f) {
            return;
        }
        this.f35955f = true;
        c.c().c(this);
        this.f35954e.a(i.c().b());
        this.f35954e.a(com.iab.omid.library.startio.internal.a.a().b());
        this.f35954e.a(this, this.f35950a);
    }

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f35952c = new f();
        this.f35955f = false;
        this.f35956g = false;
        this.f35951b = adSessionConfiguration;
        this.f35950a = adSessionContext;
        this.f35957h = str;
        b(null);
        this.f35954e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.startio.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f35954e.i();
        c.c().a(this);
        this.f35954e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f35953d.clear();
            }
        }
    }

    private void b(View view) {
        this.f35953d = new com.iab.omid.library.startio.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.startio.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.startio.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f35960k.onPossibleObstructionsDetected(this.f35957h, arrayList);
        }
    }

    void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f35959j = true;
    }
}
