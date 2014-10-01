package iit.csp595.bean;

import iit.csp595.domain.Message;

import java.io.Serializable;
import java.util.SortedMap;
import java.util.TreeMap;

public abstract class GenericPageBean<T> implements Serializable {

  private static final long serialVersionUID = 1L;
  protected String browserPageTitle = "CSP-595 Store";
  protected final String pageDirFileName;
  protected SortedMap<String, String> breadcrumb = new TreeMap<String, String>();
  protected String activeNavName;
  protected Message message;

  protected GenericPageBean(String pageDirFileName, Message message) {
    this.pageDirFileName = pageDirFileName;
    this.message = message;
  }

  public SortedMap<String, String> getBreadcrumb() {
    return breadcrumb;
  }

  public void setBreadcrumb(SortedMap<String, String> breadcrumb) {
    this.breadcrumb = breadcrumb;
  }

  public String getActiveNavName() {
    return activeNavName;
  }

  public void setActiveNavName(String activeNavName) {
    this.activeNavName = activeNavName;
  }

  public String getBrowserPageTitle() {
    return browserPageTitle;
  }

  public void setBrowserPageTitle(String browserPageTitle) {
    this.browserPageTitle = browserPageTitle;
  }

  public String getPageDirFileName() {
    return pageDirFileName;
  }

  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }

}
