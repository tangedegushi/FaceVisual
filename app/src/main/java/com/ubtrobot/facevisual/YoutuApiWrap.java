package com.ubtrobot.facevisual;

import com.ubtrobot.facevisual.facebean.CompareFaceRequest;
import com.ubtrobot.facevisual.facebean.CompareFaceResponse;
import com.ubtrobot.facevisual.facebean.CopyPersonRequest;
import com.ubtrobot.facevisual.facebean.CopyPersonResponse;
import com.ubtrobot.facevisual.facebean.CreateFaceRequest;
import com.ubtrobot.facevisual.facebean.CreateFaceResponse;
import com.ubtrobot.facevisual.facebean.CreateGroupRequest;
import com.ubtrobot.facevisual.facebean.CreateGroupResponse;
import com.ubtrobot.facevisual.facebean.CreatePersonRequest;
import com.ubtrobot.facevisual.facebean.CreatePersonResponse;
import com.ubtrobot.facevisual.facebean.DeleteFaceRequest;
import com.ubtrobot.facevisual.facebean.DeleteFaceResponse;
import com.ubtrobot.facevisual.facebean.DeleteGroupResponse;
import com.ubtrobot.facevisual.facebean.DeletePersonFromGroupRequest;
import com.ubtrobot.facevisual.facebean.DeletePersonFromGroupResponse;
import com.ubtrobot.facevisual.facebean.DeletePersonRequest;
import com.ubtrobot.facevisual.facebean.DeletePersonResponse;
import com.ubtrobot.facevisual.facebean.DetectFaceAttributesRequest;
import com.ubtrobot.facevisual.facebean.DetectFaceAttributesResponse;
import com.ubtrobot.facevisual.facebean.GetGroupInfoRequest;
import com.ubtrobot.facevisual.facebean.GetGroupInfoResponse;
import com.ubtrobot.facevisual.facebean.GetGroupListRequest;
import com.ubtrobot.facevisual.facebean.GetGroupListResponse;
import com.ubtrobot.facevisual.facebean.GetPersonBaseInfoRequest;
import com.ubtrobot.facevisual.facebean.GetPersonBaseInfoResponse;
import com.ubtrobot.facevisual.facebean.GetPersonGroupInfoRequest;
import com.ubtrobot.facevisual.facebean.GetPersonGroupInfoResponse;
import com.ubtrobot.facevisual.facebean.GetPersonListNumRequest;
import com.ubtrobot.facevisual.facebean.GetPersonListNumResponse;
import com.ubtrobot.facevisual.facebean.GetPersonListRequest;
import com.ubtrobot.facevisual.facebean.GetPersonListResponse;
import com.ubtrobot.facevisual.facebean.ModifyPersonBaseInfoRequest;
import com.ubtrobot.facevisual.facebean.ModifyPersonBaseInfoResponse;
import com.ubtrobot.facevisual.facebean.ModifyPersonGroupInfoRequest;
import com.ubtrobot.facevisual.facebean.ModifyPersonGroupInfoResponse;
import com.ubtrobot.facevisual.facebean.Response;
import com.ubtrobot.facevisual.facebean.SearchPersonsRequest;
import com.ubtrobot.facevisual.facebean.SearchPersonsResponse;
import com.ubtrobot.facevisual.facebean.SearchPersonsReturnsByGroupRequest;
import com.ubtrobot.facevisual.facebean.SearchPersonsReturnsByGroupResponse;
import com.ubtrobot.facevisual.facebean.VerifyPersonRequest;
import com.ubtrobot.facevisual.facebean.VerifyPersonResponse;
import com.ubtrobot.facevisual.facebean.DeleteGroupRequest;
import com.ubtrobot.facevisual.net.API;
import com.ubtrobot.facevisual.net.HttpHeaders;
import com.ubtrobot.facevisual.net.RetrofitManager;
import com.ubtrobot.facevisual.net.error.CommonObserver;
import com.ubtrobot.facevisual.utils.Convert;

import java.util.Map;

import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.RequestBody;

/**
 * @auther tangedegushi
 * @creat 2020/8/28
 * @Decribe
 */
public class YoutuApiWrap {

    private static final YoutuApiWrap youtu = new YoutuApiWrap();

    public static final String testFaceUrl = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1598516792513&di=9032ddbde8cdc83bfa0787f28fe7fd77&imgtype=0&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fq_70%2Cc_zoom%2Cw_640%2Fimages%2F20181222%2F92e9f17395014804bbcc0b781a8ed04c.jpeg";
    private final API api;

    private YoutuApiWrap() {
        api = RetrofitManager.get().createService(API.class);
    }

    public static YoutuApiWrap get() {
        return youtu;
    }

    /**
     * 人脸检测，检查人脸在图片中的位置及相关属性
     *
     * @param request
     */
    public void detectFace(DetectFaceAttributesRequest request, RequestCallback<DetectFaceAttributesResponse> callback) {
        RequestContent content = RequestContent.get("DetectFaceAttributes", request);
        api.detectFace(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<DetectFaceAttributesResponse>>() {
                    @Override
                    public void onNext(Response<DetectFaceAttributesResponse> response) {
                        if (callback == null) return;
                        callback.call(response.getResponse());
                    }
                });
    }

    /**
     * 人员搜索
     *
     * @param request
     */
    public void searchPersons(SearchPersonsRequest request, RequestCallback<SearchPersonsResponse> callback) {
        RequestContent content = RequestContent.get("SearchPersons", request);
        api.searchPersons(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<SearchPersonsResponse>>() {
                    @Override
                    public void onNext(Response<SearchPersonsResponse> response) {
                        if (callback == null) return;
                        callback.call(response.getResponse());
                    }
                });
    }

    /**
     * 人员搜索按库返回
     *
     * @param request
     */
    public void searchPersonsReturnsByGroup(SearchPersonsReturnsByGroupRequest request, RequestCallback<SearchPersonsReturnsByGroupResponse> callback) {
        RequestContent content = RequestContent.get("SearchPersonsReturnsByGroup", request);
        api.searchPersonsReturnsByGroup(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<SearchPersonsReturnsByGroupResponse>>() {
                    @Override
                    public void onNext(Response<SearchPersonsReturnsByGroupResponse> response) {
                        if (callback == null) return;
                        callback.call(response.getResponse());
                    }
                });
    }

    /**
     * 人脸比对
     *
     * @param request
     */
    public void compareFace(CompareFaceRequest request, RequestCallback<CompareFaceResponse> callback) {
        RequestContent content = RequestContent.get("CompareFace", request);
        api.compareFace(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<CompareFaceResponse>>() {
                    @Override
                    public void onNext(Response<CompareFaceResponse> response) {
                        if (callback == null) return;
                        callback.call(response.getResponse());
                    }
                });
    }

    /**
     * 人员验证
     *
     * @param request
     */
    public void verifyPerson(VerifyPersonRequest request, RequestCallback<VerifyPersonResponse> callback) {
        RequestContent content = RequestContent.get("VerifyPerson", request);
        api.verifyPerson(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<VerifyPersonResponse>>() {
                    @Override
                    public void onNext(Response<VerifyPersonResponse> response) {
                        if (callback == null) return;
                        callback.call(response.getResponse());
                    }
                });
    }

    /**
     * 创建人员库
     *
     * @param request
     */
    public void createGroup(CreateGroupRequest request, RequestCallback<CreateGroupResponse> callback) {
        RequestContent content = RequestContent.get("CreateGroup", request);
        api.createGroup(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<CreateGroupResponse>>() {
                    @Override
                    public void onNext(Response<CreateGroupResponse> response) {
                        if (callback == null) return;
                        callback.call(response.getResponse());
                    }
                });
    }


    /**
     * 删除人员库
     *
     * @param request
     */
    public void deleteGroup(DeleteGroupRequest request, RequestCallback<DeleteGroupResponse> callback) {
        RequestContent content = RequestContent.get("DeleteGroup", request);
        api.deleteGroup(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<DeleteGroupResponse>>() {
                    @Override
                    public void onNext(Response<DeleteGroupResponse> response) {
                        if (callback == null) return;
                        callback.call(response.getResponse());
                    }
                });
    }

    /**
     * 获取人员库信息
     *
     * @param request
     */
    public void getGroupInfo(GetGroupInfoRequest request, RequestCallback<GetGroupInfoResponse> callback) {
        RequestContent content = RequestContent.get("GetGroupInfo", request);
        api.getGroupInfo(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<GetGroupInfoResponse>>() {
                    @Override
                    public void onNext(Response<GetGroupInfoResponse> response) {
                        if (callback == null) return;
                        callback.call(response.getResponse());
                    }
                });
    }

    /**
     * 获取人员库列表
     *
     * @param request
     */
    public void getGroupList(GetGroupListRequest request, RequestCallback<GetGroupListResponse> callback) {
        RequestContent content = RequestContent.get("GetGroupList", request);
        api.getGroupList(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<GetGroupListResponse>>() {
                    @Override
                    public void onNext(Response<GetGroupListResponse> response) {
                        if (callback == null) return;
                        callback.call(response.getResponse());
                    }
                });
    }

    /**
     * 创建人员
     *
     * @param request
     */
    public void createPerson(CreatePersonRequest request, RequestCallback<CreatePersonResponse> callback) {
        RequestContent content = RequestContent.get("CreatePerson", request);
        api.createPerson(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<CreatePersonResponse>>() {
                    @Override
                    public void onNext(Response<CreatePersonResponse> response) {
                        if (callback == null) return;
                        callback.call(response.getResponse());
                    }
                });
    }

    /**
     * 删除人员
     *
     * @param request
     */
    public void deletePerson(DeletePersonRequest request, RequestCallback<DeletePersonResponse> callback) {
        RequestContent content = RequestContent.get("DeletePerson", request);
        api.deletePerson(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<DeletePersonResponse>>() {
                    @Override
                    public void onNext(Response<DeletePersonResponse> response) {
                        if (callback == null) return;
                        callback.call(response.getResponse());
                    }
                });
    }

    /**
     * 人员库中删除人员
     *
     * @param request
     */
    public void deletePersonFromGroup(DeletePersonFromGroupRequest request, RequestCallback<DeletePersonFromGroupResponse> callback) {
        RequestContent content = RequestContent.get("DeletePersonFromGroup", request);
        api.deletePersonFromGroup(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<DeletePersonFromGroupResponse>>() {
                    @Override
                    public void onNext(Response<DeletePersonFromGroupResponse> response) {
                        if (callback == null) return;
                        callback.call(response.getResponse());
                    }
                });
    }

    /**
     * 获取人员归属信息
     *
     * @param request
     */
    public void getPersonGroupInfo(GetPersonGroupInfoRequest request, RequestCallback<GetPersonGroupInfoResponse> callback) {
        RequestContent content = RequestContent.get("GetPersonGroupInfo", request);
        api.getPersonGroupInfo(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<GetPersonGroupInfoResponse>>() {
                    @Override
                    public void onNext(Response<GetPersonGroupInfoResponse> response) {
                        if (callback == null) return;
                        callback.call(response.getResponse());
                    }
                });
    }

    /**
     * 获取人员基础信息
     *
     * @param request
     */
    public void getPersonBaseInfo(GetPersonBaseInfoRequest request, RequestCallback<GetPersonBaseInfoResponse> callback) {
        RequestContent content = RequestContent.get("GetPersonBaseInfo", request);
        api.getPersonBaseInfo(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<GetPersonBaseInfoResponse>>() {
                    @Override
                    public void onNext(Response<GetPersonBaseInfoResponse> response) {
                        if (callback == null) return;
                        callback.call(response.getResponse());
                    }
                });
    }

    /**
     * 获取人员列表
     *
     * @param request
     */
    public void getPersonList(GetPersonListRequest request, RequestCallback<GetPersonListResponse> callback) {
        RequestContent content = RequestContent.get("GetPersonList", request);
        api.getPersonList(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<GetPersonListResponse>>() {
                    @Override
                    public void onNext(Response<GetPersonListResponse> response) {
                        if (callback == null) return;
                        callback.call(response.getResponse());
                    }
                });
    }

    /**
     * 获取人员列表长度
     *
     * @param request
     */
    public void getPersonListNum(GetPersonListNumRequest request, RequestCallback<GetPersonListNumResponse> callback) {
        RequestContent content = RequestContent.get("GetPersonListNum", request);
        api.getPersonListNum(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<GetPersonListNumResponse>>() {
                    @Override
                    public void onNext(Response<GetPersonListNumResponse> response) {
                        if (callback == null) return;
                        callback.call(response.getResponse());
                    }
                });
    }

    /**
     * 修改人员描述信息
     *
     * @param request
     */
    public void modifyPersonGroupInfo(ModifyPersonGroupInfoRequest request, RequestCallback<ModifyPersonGroupInfoResponse> callback) {
        RequestContent content = RequestContent.get("ModifyPersonGroupInfo", request);
        api.modifyPersonGroupInfo(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<ModifyPersonGroupInfoResponse>>() {
                    @Override
                    public void onNext(Response<ModifyPersonGroupInfoResponse> response) {
                        if (callback == null) return;
                        callback.call(response.getResponse());
                    }
                });
    }

    /**
     * 修改人员基础信息
     *
     * @param request
     */
    public void modifyPersonBaseInfo(ModifyPersonBaseInfoRequest request, RequestCallback<ModifyPersonBaseInfoResponse> callback) {
        RequestContent content = RequestContent.get("ModifyPersonBaseInfo", request);
        api.modifyPersonBaseInfo(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<ModifyPersonBaseInfoResponse>>() {
                    @Override
                    public void onNext(Response<ModifyPersonBaseInfoResponse> response) {
                        if (callback == null) return;
                        callback.call(response.getResponse());
                    }
                });
    }

    /**
     * 复制人员
     *
     * @param request
     */
    public void copyPerson(CopyPersonRequest request, RequestCallback<CopyPersonResponse> callback) {
        RequestContent content = RequestContent.get("CopyPerson", request);
        api.copyPerson(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<CopyPersonResponse>>() {
                    @Override
                    public void onNext(Response<CopyPersonResponse> response) {
                        if (callback == null) return;
                        callback.call(response.getResponse());
                    }
                });
    }

    /**
     * 添加人脸
     *
     * @param request
     */
    public void addFace(CreateFaceRequest request, RequestCallback<CreateFaceResponse> callback) {
        RequestContent content = RequestContent.get("CreateFace", request);
        api.addFace(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<CreateFaceResponse>>() {
                    @Override
                    public void onNext(Response<CreateFaceResponse> response) {
                        if (callback == null) return;
                        callback.call(response.getResponse());
                    }
                });
    }

    /**
     * 删除人脸
     *
     * @param request
     */
    public void deleteFace(DeleteFaceRequest request, RequestCallback<DeleteFaceResponse> callback) {
        RequestContent content = RequestContent.get("DeleteFace", request);
        api.deleteFace(content.getBody(),content.getHeader())
                .compose(applySchedulers())
                .subscribe(new CommonObserver<Response<DeleteFaceResponse>>() {
                    @Override
                    public void onNext(Response<DeleteFaceResponse> deleteFaceResponse) {
                        if (callback == null) return;
                        callback.call(deleteFaceResponse.getResponse());
                    }
                });
    }

    public static <T> ObservableTransformer<T, T> applySchedulers() {
        return observable -> observable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }
    
    public interface RequestCallback<T>{
        void call(T t);
    }

    private static class RequestContent{
        private String action;
        private String bodyMsg;

        public static RequestContent get(String action, Object bodyMsg){
            return new RequestContent(action,bodyMsg);
        }

        public RequestContent(String action, Object bodyMsg) {
            this.action = action;
            this.bodyMsg = Convert.toJson(bodyMsg);
        }

        public RequestBody getBody() {
            return RequestBody.create(bodyMsg.getBytes());
        }

        public Map<String, String> getHeader() {
            return HttpHeaders.getHeader(action, bodyMsg);
        }
    }
}
