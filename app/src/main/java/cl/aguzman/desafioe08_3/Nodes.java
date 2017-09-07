package cl.aguzman.desafioe08_3;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Nodes {

    private DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference();

    public DatabaseReference ref(){
        return databaseReference.child("albums");
    }
}
