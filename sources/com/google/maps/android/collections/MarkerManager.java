package com.google.maps.android.collections;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.AdvancedMarkerOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.collections.MapObjectManager;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class MarkerManager extends MapObjectManager<Marker, Collection> implements GoogleMap.OnInfoWindowClickListener, GoogleMap.OnMarkerClickListener, GoogleMap.OnMarkerDragListener, GoogleMap.InfoWindowAdapter, GoogleMap.OnInfoWindowLongClickListener {
    public MarkerManager(GoogleMap googleMap) {
        super(googleMap);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    void b() {
        GoogleMap googleMap = this.f33906a;
        if (googleMap != null) {
            googleMap.setOnInfoWindowClickListener(this);
            this.f33906a.setOnInfoWindowLongClickListener(this);
            this.f33906a.setOnMarkerClickListener(this);
            this.f33906a.setOnMarkerDragListener(this);
            this.f33906a.setInfoWindowAdapter(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.maps.android.collections.MapObjectManager
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(Marker marker) {
        marker.remove();
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection getCollection(String str) {
        return super.getCollection(str);
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoContents(@NonNull Marker marker) {
        Collection collection = (Collection) this.f33908c.get(marker);
        if (collection == null || collection.f33916g == null) {
            return null;
        }
        return collection.f33916g.getInfoContents(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoWindow(@NonNull Marker marker) {
        Collection collection = (Collection) this.f33908c.get(marker);
        if (collection == null || collection.f33916g == null) {
            return null;
        }
        return collection.f33916g.getInfoWindow(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public void onInfoWindowClick(@NonNull Marker marker) {
        Collection collection = (Collection) this.f33908c.get(marker);
        if (collection == null || collection.f33912c == null) {
            return;
        }
        collection.f33912c.onInfoWindowClick(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener
    public void onInfoWindowLongClick(@NonNull Marker marker) {
        Collection collection = (Collection) this.f33908c.get(marker);
        if (collection == null || collection.f33913d == null) {
            return;
        }
        collection.f33913d.onInfoWindowLongClick(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public boolean onMarkerClick(@NonNull Marker marker) {
        Collection collection = (Collection) this.f33908c.get(marker);
        if (collection == null || collection.f33914e == null) {
            return false;
        }
        return collection.f33914e.onMarkerClick(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDrag(@NonNull Marker marker) {
        Collection collection = (Collection) this.f33908c.get(marker);
        if (collection == null || collection.f33915f == null) {
            return;
        }
        collection.f33915f.onMarkerDrag(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDragEnd(@NonNull Marker marker) {
        Collection collection = (Collection) this.f33908c.get(marker);
        if (collection == null || collection.f33915f == null) {
            return;
        }
        collection.f33915f.onMarkerDragEnd(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
    public void onMarkerDragStart(@NonNull Marker marker) {
        Collection collection = (Collection) this.f33908c.get(marker);
        if (collection == null || collection.f33915f == null) {
            return;
        }
        collection.f33915f.onMarkerDragStart(marker);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ boolean remove(Marker marker) {
        return super.remove(marker);
    }

    public class Collection extends MapObjectManager.Collection {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private GoogleMap.OnInfoWindowClickListener f33912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private GoogleMap.OnInfoWindowLongClickListener f33913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private GoogleMap.OnMarkerClickListener f33914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private GoogleMap.OnMarkerDragListener f33915f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private GoogleMap.InfoWindowAdapter f33916g;

        public Collection() {
            super();
        }

        public void addAll(java.util.Collection<MarkerOptions> collection) {
            Iterator<MarkerOptions> it = collection.iterator();
            while (it.hasNext()) {
                addMarker(it.next());
            }
        }

        public Marker addMarker(MarkerOptions markerOptions) {
            Marker markerAddMarker = MarkerManager.this.f33906a.addMarker(markerOptions);
            super.a(markerAddMarker);
            return markerAddMarker;
        }

        public java.util.Collection<Marker> getMarkers() {
            return b();
        }

        public void hideAll() {
            Iterator<Marker> it = getMarkers().iterator();
            while (it.hasNext()) {
                it.next().setVisible(false);
            }
        }

        public boolean remove(Marker marker) {
            return super.c(marker);
        }

        public void setInfoWindowAdapter(GoogleMap.InfoWindowAdapter infoWindowAdapter) {
            this.f33916g = infoWindowAdapter;
        }

        public void setOnInfoWindowClickListener(GoogleMap.OnInfoWindowClickListener onInfoWindowClickListener) {
            this.f33912c = onInfoWindowClickListener;
        }

        public void setOnInfoWindowLongClickListener(GoogleMap.OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
            this.f33913d = onInfoWindowLongClickListener;
        }

        public void setOnMarkerClickListener(GoogleMap.OnMarkerClickListener onMarkerClickListener) {
            this.f33914e = onMarkerClickListener;
        }

        public void setOnMarkerDragListener(GoogleMap.OnMarkerDragListener onMarkerDragListener) {
            this.f33915f = onMarkerDragListener;
        }

        public void showAll() {
            Iterator<Marker> it = getMarkers().iterator();
            while (it.hasNext()) {
                it.next().setVisible(true);
            }
        }

        public void addAll(java.util.Collection<MarkerOptions> collection, boolean z10) {
            Iterator<MarkerOptions> it = collection.iterator();
            while (it.hasNext()) {
                addMarker(it.next()).setVisible(z10);
            }
        }

        public Marker addMarker(AdvancedMarkerOptions advancedMarkerOptions) {
            Marker markerAddMarker = MarkerManager.this.f33906a.addMarker(advancedMarkerOptions);
            super.a(markerAddMarker);
            return markerAddMarker;
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
