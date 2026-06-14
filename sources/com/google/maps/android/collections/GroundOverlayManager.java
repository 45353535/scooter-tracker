package com.google.maps.android.collections;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.GroundOverlay;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.maps.android.collections.MapObjectManager;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class GroundOverlayManager extends MapObjectManager<GroundOverlay, Collection> implements GoogleMap.OnGroundOverlayClickListener {
    public GroundOverlayManager(@NonNull GoogleMap googleMap) {
        super(googleMap);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    void b() {
        GoogleMap googleMap = this.f33906a;
        if (googleMap != null) {
            googleMap.setOnGroundOverlayClickListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.maps.android.collections.MapObjectManager
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(GroundOverlay groundOverlay) {
        groundOverlay.remove();
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection getCollection(String str) {
        return super.getCollection(str);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener
    public void onGroundOverlayClick(@NonNull GroundOverlay groundOverlay) {
        Collection collection = (Collection) this.f33908c.get(groundOverlay);
        if (collection == null || collection.f33904c == null) {
            return;
        }
        collection.f33904c.onGroundOverlayClick(groundOverlay);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ boolean remove(GroundOverlay groundOverlay) {
        return super.remove(groundOverlay);
    }

    public class Collection extends MapObjectManager.Collection {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private GoogleMap.OnGroundOverlayClickListener f33904c;

        public Collection() {
            super();
        }

        public void addAll(java.util.Collection<GroundOverlayOptions> collection) {
            Iterator<GroundOverlayOptions> it = collection.iterator();
            while (it.hasNext()) {
                addGroundOverlay(it.next());
            }
        }

        public GroundOverlay addGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
            GroundOverlay groundOverlayAddGroundOverlay = GroundOverlayManager.this.f33906a.addGroundOverlay(groundOverlayOptions);
            super.a(groundOverlayAddGroundOverlay);
            return groundOverlayAddGroundOverlay;
        }

        public java.util.Collection<GroundOverlay> getGroundOverlays() {
            return b();
        }

        public void hideAll() {
            Iterator<GroundOverlay> it = getGroundOverlays().iterator();
            while (it.hasNext()) {
                it.next().setVisible(false);
            }
        }

        public boolean remove(GroundOverlay groundOverlay) {
            return super.c(groundOverlay);
        }

        public void setOnGroundOverlayClickListener(GoogleMap.OnGroundOverlayClickListener onGroundOverlayClickListener) {
            this.f33904c = onGroundOverlayClickListener;
        }

        public void showAll() {
            Iterator<GroundOverlay> it = getGroundOverlays().iterator();
            while (it.hasNext()) {
                it.next().setVisible(true);
            }
        }

        public void addAll(java.util.Collection<GroundOverlayOptions> collection, boolean z10) {
            Iterator<GroundOverlayOptions> it = collection.iterator();
            while (it.hasNext()) {
                addGroundOverlay(it.next()).setVisible(z10);
            }
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection newCollection(String str) {
        return super.newCollection(str);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public Collection newCollection() {
        return new Collection();
    }
}
