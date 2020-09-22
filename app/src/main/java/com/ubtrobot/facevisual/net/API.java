package com.ubtrobot.facevisual.net;

import com.ubtrobot.facevisual.facebean.CompareFaceResponse;
import com.ubtrobot.facevisual.facebean.CopyPersonResponse;
import com.ubtrobot.facevisual.facebean.CreateFaceResponse;
import com.ubtrobot.facevisual.facebean.CreateGroupResponse;
import com.ubtrobot.facevisual.facebean.CreatePersonResponse;
import com.ubtrobot.facevisual.facebean.DeleteFaceResponse;
import com.ubtrobot.facevisual.facebean.DeleteGroupResponse;
import com.ubtrobot.facevisual.facebean.DeletePersonFromGroupRequest;
import com.ubtrobot.facevisual.facebean.DeletePersonFromGroupResponse;
import com.ubtrobot.facevisual.facebean.DeletePersonResponse;
import com.ubtrobot.facevisual.facebean.DetectFaceAttributesResponse;
import com.ubtrobot.facevisual.facebean.GetGroupInfoResponse;
import com.ubtrobot.facevisual.facebean.GetGroupListResponse;
import com.ubtrobot.facevisual.facebean.GetPersonBaseInfoResponse;
import com.ubtrobot.facevisual.facebean.GetPersonGroupInfoResponse;
import com.ubtrobot.facevisual.facebean.GetPersonListNumResponse;
import com.ubtrobot.facevisual.facebean.GetPersonListResponse;
import com.ubtrobot.facevisual.facebean.ModifyPersonBaseInfoRequest;
import com.ubtrobot.facevisual.facebean.ModifyPersonBaseInfoResponse;
import com.ubtrobot.facevisual.facebean.ModifyPersonGroupInfoResponse;
import com.ubtrobot.facevisual.facebean.Response;
import com.ubtrobot.facevisual.facebean.SearchPersonsResponse;
import com.ubtrobot.facevisual.facebean.SearchPersonsReturnsByGroupResponse;
import com.ubtrobot.facevisual.facebean.VerifyPersonResponse;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;

/**
 * @auther tangedegushi
 * @creat 2020/8/20
 * @Decribe
 */
public interface API {

    @POST("/")
    Observable<Response<DetectFaceAttributesResponse>> detectFace(@Body RequestBody body, @HeaderMap Map<String, String> headMap);

    @POST("/")
    Observable<Response<SearchPersonsResponse>> searchPersons(@Body RequestBody body, @HeaderMap Map<String, String> headMap);

    @POST("/")
    Observable<Response<SearchPersonsReturnsByGroupResponse>> searchPersonsReturnsByGroup(@Body RequestBody body, @HeaderMap Map<String, String> headMap);

    @POST("/")
    Observable<Response<CompareFaceResponse>> compareFace(@Body RequestBody body, @HeaderMap Map<String, String> headMap);

    @POST("/")
    Observable<Response<VerifyPersonResponse>> verifyPerson(@Body RequestBody body, @HeaderMap Map<String, String> headMap);

    @POST("/")
    Observable<Response<CreateGroupResponse>> createGroup(@Body RequestBody body, @HeaderMap Map<String, String> headMap);

    @POST("/")
    Observable<Response<DeleteGroupResponse>> deleteGroup(@Body RequestBody body, @HeaderMap Map<String, String> headMap);

    @POST("/")
    Observable<Response<GetGroupInfoResponse>> getGroupInfo(@Body RequestBody body, @HeaderMap Map<String, String> headMap);

    @POST("/")
    Observable<Response<GetGroupListResponse>> getGroupList(@Body RequestBody body, @HeaderMap Map<String, String> headMap);

    @POST("/")
    Observable<Response<CreatePersonResponse>> createPerson(@Body RequestBody body, @HeaderMap Map<String, String> headMap);

    @POST("/")
    Observable<Response<DeletePersonResponse>> deletePerson(@Body RequestBody body, @HeaderMap Map<String, String> headMap);

    @POST("/")
    Observable<Response<DeletePersonFromGroupResponse>> deletePersonFromGroup(@Body RequestBody body, @HeaderMap Map<String, String> headMap);

    @POST("/")
    Observable<Response<GetPersonGroupInfoResponse>> getPersonGroupInfo(@Body RequestBody body, @HeaderMap Map<String, String> headMap);

    @POST("/")
    Observable<Response<GetPersonBaseInfoResponse>> getPersonBaseInfo(@Body RequestBody body, @HeaderMap Map<String, String> headMap);

    @POST("/")
    Observable<Response<GetPersonListResponse>> getPersonList(@Body RequestBody body, @HeaderMap Map<String, String> headMap);

    @POST("/")
    Observable<Response<GetPersonListNumResponse>> getPersonListNum(@Body RequestBody body, @HeaderMap Map<String, String> headMap);

    @POST("/")
    Observable<Response<ModifyPersonGroupInfoResponse>> modifyPersonGroupInfo(@Body RequestBody body, @HeaderMap Map<String, String> headMap);

    @POST("/")
    Observable<Response<ModifyPersonBaseInfoResponse>> modifyPersonBaseInfo(@Body RequestBody body, @HeaderMap Map<String, String> headMap);

    @POST("/")
    Observable<Response<CopyPersonResponse>> copyPerson(@Body RequestBody body, @HeaderMap Map<String, String> headMap);

    @POST("/")
    Observable<Response<CreateFaceResponse>> addFace(@Body RequestBody body, @HeaderMap Map<String, String> headMap);

    @POST("/")
    Observable<Response<DeleteFaceResponse>> deleteFace(@Body RequestBody body, @HeaderMap Map<String, String> headMap);


}
