package com.example.recommenadationsystem;



import android.content.Context;
import android.widget.Toast;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
//import com.google.firebase.firestore.CollectionReference;
//import com.google.firebase.firestore.FirebaseFirestore;

import java.net.ContentHandler;
import java.text.SimpleDateFormat;

public class Utility {
    static void showToast(Context context,String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
//    static CollectionReference getCollectionReferenceForNotes()
//    {
//        FirebaseUser currentuser= FirebaseAuth.getInstance().getCurrentUser();
//        return FirebaseFirestore.getInstance().collection("notes").document(currentuser.getUid()).collection("my_notes");
//    }
//    static String  timestampToString(Timestamp timestamp)
//    {
//        return new SimpleDateFormat("MM/dd/yyyy").format(timestamp.toDate());
//    }
}