package cl.aguzman.desafioe08_3;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;

public class AlbumsAdapter extends FirebaseRecyclerAdapter<Albums, AlbumsAdapter.AlbumHolder>{

    public AlbumsAdapter() {
        super(Albums.class, R.layout.list_item_album, AlbumHolder.class, new Nodes().ref());
    }

    @Override
    protected void populateViewHolder(AlbumHolder viewHolder, Albums model, int position) {
        viewHolder.name.setText(model.getName());
        viewHolder.band.setText(model.getBand());
        viewHolder.release.setText(String.valueOf(model.getRelease()));
    }

    public static class AlbumHolder extends RecyclerView.ViewHolder{
        private TextView name, band, release;

        public AlbumHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.nameTv);
            band = (TextView) itemView.findViewById(R.id.bandTv);
            release = (TextView) itemView.findViewById(R.id.releaseTv);
        }
    }
}
