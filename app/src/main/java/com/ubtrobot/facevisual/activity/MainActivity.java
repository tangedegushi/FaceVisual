package com.ubtrobot.facevisual.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;

import com.ubtrobot.facevisual.MyLogger;
import com.ubtrobot.facevisual.R;
import com.ubtrobot.facevisual.YoutuApiWrap;
import com.ubtrobot.facevisual.facebean.CreateGroupRequest;
import com.ubtrobot.facevisual.facebean.CreatePersonRequest;
import com.ubtrobot.facevisual.facebean.DeleteGroupRequest;
import com.ubtrobot.facevisual.facebean.DeletePersonRequest;
import com.ubtrobot.facevisual.facebean.DetectFaceAttributesRequest;
import com.ubtrobot.facevisual.facebean.PersonExDescriptionInfo;
import com.ubtrobot.facevisual.utils.Base64;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private String facePath;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        File file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        String[] list = file.list();
        for (String s : list) {
            MyLogger.zLog().d("file name = "+s);
        }
        facePath = file.getPath()+File.separator+"woman_face.jpg";

    }


    public void click(View v) {
        switch (v.getId()) {
            case R.id.add_group:
                YoutuApiWrap.get().createGroup(new CreateGroupRequest.Builder("groupName", "groupId").build(),null);
                break;
            case R.id.delete_group:
                YoutuApiWrap.get().deleteGroup(new DeleteGroupRequest("tangedegushi"),null);
                break;
            case R.id.create_person:
//                YoutuApiWrap.get().createPersonUrl();
                PersonExDescriptionInfo info = new PersonExDescriptionInfo();
                info.setPersonExDescriptionIndex(1l);
                info.setPersonExDescription("人员描述1");
                PersonExDescriptionInfo info1 = new PersonExDescriptionInfo();
                info1.setPersonExDescriptionIndex(2l);
                info1.setPersonExDescription("人员描述2");

                CreatePersonRequest request = new CreatePersonRequest.Builder("tangedegushi","zzq","tangedegushi12")
                        .setImage(Base64.imageToBase64(facePath))
                        .setPersonExDescriptionInfos(new PersonExDescriptionInfo[]{info,info1})
                        .setGender(2l)
                        .build();
                YoutuApiWrap.get().createPerson(request,null);
                break;
            case R.id.delete_person:
                DeletePersonRequest request1 = new DeletePersonRequest("tangedegushi12");
                YoutuApiWrap.get().deletePerson(request1,null);
                break;
            case R.id.detect_face:
                YoutuApiWrap.get().detectFace(new DetectFaceAttributesRequest.Builder().setImage(Base64.imageToBase64(facePath)).build(),null);
                break;
        }
    }



}
