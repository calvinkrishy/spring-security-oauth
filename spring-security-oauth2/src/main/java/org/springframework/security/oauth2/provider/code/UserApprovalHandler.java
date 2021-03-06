package org.springframework.security.oauth2.provider.code;

import org.springframework.security.oauth2.provider.ClientToken;

/**
 * Basic interface for determining whether a given client authentication request has been approved by the current user.
 *
 * @author Ryan Heaton
 */
public interface UserApprovalHandler {

  /**
   * Whether the specified client authentication has been approved by the current user.
   *
   * @param clientAuthentication The client authentication.
   * @return Whether the specified client authentication has been approved by the current user.
   */
  boolean isApproved(ClientToken clientAuthentication);
}
