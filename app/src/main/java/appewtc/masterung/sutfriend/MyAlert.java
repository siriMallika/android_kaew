package appewtc.masterung.sutfriend;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by Admin on 21/9/2559.
 */
public class MyAlert {

    //Explicit
    private Context context;
    private int anTnt;
    private String titleString,messageString;

    //generate constructor
    public MyAlert(Context context, int anTnt, String titleString, String messageString) {
        this.context = context;
        this.anTnt = anTnt;
        this.titleString = titleString;
        this.messageString = messageString;
    }

    public void myDialog(){
        AlertDialog.Builder builder=new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(anTnt);
        builder.setTitle(titleString);
        builder.setMessage(messageString);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override //ดึงclassสำเร็จรูปมาทำงาน
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();
    }
}
