package com.java2e.martin.common.websocket.socketio.util;

import com.corundumstudio.socketio.HandshakeData;
import com.java2e.martin.common.core.constant.WebsocketConstants;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 狮少
 * @version 1.0
 * @date 2021/7/24
 * @describtion ParseHeaderUtil
 * @since 1.0
 */
@Slf4j
public class ParseHeaderUtil {
    public static String parseTokenFromHeader(HandshakeData handshakeData) {
        String token = handshakeData.getSingleUrlParam(WebsocketConstants.TOKEN);
        log.info("Authorization, token: {}", token);
        return token;
    }

    public static String parseUserNameFromHeader(HandshakeData handshakeData) {
        String userName = handshakeData.getSingleUrlParam(WebsocketConstants.USER_NAME);
        log.info("userName: {}", userName);
        return userName;
    }

    public static String parseProjectIdFromHeader(HandshakeData handshakeData) {
        String projectId = handshakeData.getSingleUrlParam(WebsocketConstants.PROJECT_ID);
        log.info("projectId: {}", projectId);
        return projectId;
    }
}
