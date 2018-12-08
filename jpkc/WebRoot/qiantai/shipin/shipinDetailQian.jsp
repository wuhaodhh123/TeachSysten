<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3c.org/TR/1999/REC-html401-19991224/loose.dtd">
<html>
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <LINK href="<%=path %>/css/css.css" type=text/css rel=stylesheet>
  </head>
  
  <BODY text=#000000  leftMargin=0 topMargin=0>
	<div class="wrap"> 
		<TABLE  cellSpacing=0 cellPadding=0 width="100%" align=center border=0  background="<%=path %>/img/reservation01.gif">
				<TR height="90">
					<TD align="center">
					    <jsp:include flush="true" page="/qiantai/inc/incTop1.jsp"></jsp:include> 
					</TD>
				</TR>
		</TABLE>
		
		
		<TABLE id=guide cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
				<TR>
					<TD align="left">
						<jsp:include flush="true" page="/qiantai/inc/incTop2.jsp"></jsp:include>
					</TD>
				</TR>
		</TABLE>

        <TABLE class=MainTable style="MARGIN-TOP: 0px" cellSpacing=0 cellPadding=0 width="100%" align=center border=0>
				<TR>
				    <TD class=Side vAlign=top align=right width="25%">
						<jsp:include flush="true" page="/qiantai/inc/incLeft.jsp"></jsp:include>
					</TD>
					<td width="1">&nbsp;</td>
					<TD class=Side vAlign=top align=right width="75%">
						<TABLE class=dragTable cellSpacing=0 cellPadding=0 width="100%" border=0>
								<TR>
									<TD class=head>
										<SPAN class=TAG>教学视频</SPAN>
									</TD>
								</TR>
								<TR align="left">
									<TD height="5"></TD>
								</TR>
								<TR align="left" height="500">
									<td>
									     <table width="100%" border="0">
										    <tr>
										       <td align="center"><c:out value="${requestScope.shipin.title}" escapeXml="false"></c:out></td>
										    </tr>
										    <tr>
										       <td align="center"><hr></td>
										    </tr>
										    <tr>
										       <td align="center"><c:out value="${requestScope.shipin.content}" escapeXml="false"></c:out></td>
										    </tr>
										    <tr>
										       <td align="center"><hr></td>
										    </tr>
										    <tr>
										       <td align="center">
										           <object id="player" height="400" width="450" classid="CLSID:6BF52A52-394A-11d3-B153-00C04F79FAA6">
														<param NAME="AutoStart" VALUE="-1">
														<!--是否自动播放-->
														<param NAME="Balance" VALUE="0">
														<!--调整左右声道平衡,同上面旧播放器代码-->
														<param name="enabled" value="-1">
														<!--播放器是否可人为控制-->
														<param NAME="EnableContextMenu" VALUE="-1">
														<!--是否启用上下文菜单-->
														<param NAME="url" VALUE="<%=path %>/${requestScope.shipin.fujian}">
														<!--播放的文件地址-->
														<param NAME="PlayCount" VALUE="1">
														<!--播放次数控制,为整数-->
														<param name="rate" value="1">
														<!--播放速率控制,1为正常,允许小数,1.0-2.0-->
														<param name="currentPosition" value="0">
														<!--控件设置:当前位置-->
														<param name="currentMarker" value="0">
														<!--控件设置:当前标记-->
														<param name="defaultFrame" value="">
														<!--显示默认框架-->
														<param name="invokeURLs" value="0">
														<!--脚本命令设置:是否调用URL-->
														<param name="baseURL" value="">
														<!--脚本命令设置:被调用的URL-->
														<param name="stretchToFit" value="0">
														<!--是否按比例伸展-->
														<param name="volume" value="50">
														<!--默认声音大小0%-100%,50则为50%-->
														<param name="mute" value="0">
														<!--是否静音-->
														<param name="uiMode" value="mini">
														<!--播放器显示模式:Full显示全部;mini最简化;None不显示播放控制,只显示视频窗口;invisible全部不显示-->
														<param name="windowlessVideo" value="0">
														<!--如果是0可以允许全屏,否则只能在窗口中查看-->
														<param name="fullScreen" value="0">
														<!--开始播放是否自动全屏-->
														<param name="enableErrorDialogs" value="-1">
														<!--是否启用错误提示报告-->
														<param name="SAMIStyle" value>
														<!--SAMI样式-->
														<param name="SAMILang" value>
														<!--SAMI语言-->
														<param name="SAMIFilename" value>
														<!--字幕ID-->
													</object>
                                               </td>
										    </tr>
										    <tr>
										       <td align="center"><hr></td>
										    </tr>
										    <tr>
										       <td align="center"><c:out value="${requestScope.shipin.title}" escapeXml="false"></c:out></td>
										    </tr>
										</table>
									</td>  
								</TR>
						</TABLE>
					</TD>
				</TR>
		</TABLE>
		<jsp:include flush="true" page="/qiantai/inc/incFoot.jsp"></jsp:include>
    </div>
  </BODY>
</html>
