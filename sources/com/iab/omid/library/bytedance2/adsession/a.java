package com.iab.omid.library.bytedance2.adsession;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.bytedance2.internal.c;
import com.iab.omid.library.bytedance2.internal.e;
import com.iab.omid.library.bytedance2.internal.f;
import com.iab.omid.library.bytedance2.internal.i;
import com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher;
import com.iab.omid.library.bytedance2.publisher.b;
import com.iab.omid.library.bytedance2.utils.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public class a extends AdSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdSessionContext f34609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdSessionConfiguration f34610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f34611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.weakreference.a f34612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AdSessionStatePublisher f34613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f34614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f34615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f34616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f34617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f34618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PossibleObstructionListener f34619k;

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext) {
        this(adSessionConfiguration, adSessionContext, UUID.randomUUID().toString());
    }

    private void a() {
        if (this.f34617i) {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private void b() {
        if (this.f34618j) {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, @Nullable String str) {
        if (this.f34615g) {
            return;
        }
        this.f34611c.a(view, friendlyObstructionPurpose, str);
    }

    public View c() {
        return this.f34612d.get();
    }

    public List<e> d() {
        return this.f34611c.a();
    }

    public boolean e() {
        return this.f34619k != null;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void error(ErrorType errorType, String str) {
        if (this.f34615g) {
            throw new IllegalStateException("AdSession is finished");
        }
        g.a(errorType, "Error type is null");
        g.a(str, "Message is null");
        getAdSessionStatePublisher().a(errorType, str);
    }

    public boolean f() {
        return this.f34614f && !this.f34615g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void finish() {
        if (this.f34615g) {
            return;
        }
        this.f34612d.clear();
        removeAllFriendlyObstructions();
        this.f34615g = true;
        getAdSessionStatePublisher().f();
        c.c().b(this);
        getAdSessionStatePublisher().b();
        this.f34613e = null;
        this.f34619k = null;
    }

    public boolean g() {
        return this.f34615g;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public String getAdSessionId() {
        return this.f34616h;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public AdSessionStatePublisher getAdSessionStatePublisher() {
        return this.f34613e;
    }

    public boolean h() {
        return this.f34610b.isNativeImpressionOwner();
    }

    public boolean i() {
        return this.f34610b.isNativeMediaEventsOwner();
    }

    public boolean j() {
        return this.f34614f;
    }

    void k() {
        a();
        getAdSessionStatePublisher().g();
        this.f34617i = true;
    }

    void l() {
        b();
        getAdSessionStatePublisher().h();
        this.f34618j = true;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void registerAdView(View view) {
        if (this.f34615g) {
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

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeAllFriendlyObstructions() {
        if (this.f34615g) {
            return;
        }
        this.f34611c.b();
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void removeFriendlyObstruction(View view) {
        if (this.f34615g) {
            return;
        }
        this.f34611c.c(view);
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void setPossibleObstructionListener(PossibleObstructionListener possibleObstructionListener) {
        this.f34619k = possibleObstructionListener;
    }

    @Override // com.iab.omid.library.bytedance2.adsession.AdSession
    public void start() {
        if (this.f34614f) {
            return;
        }
        this.f34614f = true;
        c.c().c(this);
        this.f34613e.a(i.c().b());
        this.f34613e.a(com.iab.omid.library.bytedance2.internal.a.a().b());
        this.f34613e.a(this, this.f34609a);
    }

    a(AdSessionConfiguration adSessionConfiguration, AdSessionContext adSessionContext, String str) {
        this.f34611c = new f();
        this.f34614f = false;
        this.f34615g = false;
        this.f34610b = adSessionConfiguration;
        this.f34609a = adSessionContext;
        this.f34616h = str;
        b(null);
        this.f34613e = (adSessionContext.getAdSessionContextType() == AdSessionContextType.HTML || adSessionContext.getAdSessionContextType() == AdSessionContextType.JAVASCRIPT) ? new com.iab.omid.library.bytedance2.publisher.a(str, adSessionContext.getWebView()) : new b(str, adSessionContext.getInjectedResourcesMap(), adSessionContext.getOmidJsScriptContent());
        this.f34613e.i();
        c.c().a(this);
        this.f34613e.a(adSessionConfiguration);
    }

    private void a(View view) {
        Collection<a> collectionB = c.c().b();
        if (collectionB == null || collectionB.isEmpty()) {
            return;
        }
        for (a aVar : collectionB) {
            if (aVar != this && aVar.c() == view) {
                aVar.f34612d.clear();
            }
        }
    }

    private void b(View view) {
        this.f34612d = new com.iab.omid.library.bytedance2.weakreference.a(view);
    }

    public void a(List<com.iab.omid.library.bytedance2.weakreference.a> list) {
        if (e()) {
            ArrayList arrayList = new ArrayList();
            Iterator<com.iab.omid.library.bytedance2.weakreference.a> it = list.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            this.f34619k.onPossibleObstructionsDetected(this.f34616h, arrayList);
        }
    }

    void a(@NonNull JSONObject jSONObject) {
        b();
        getAdSessionStatePublisher().a(jSONObject);
        this.f34618j = true;
    }
}
