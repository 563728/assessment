<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>    
    <title>WS Test</title>
  </head>
 
  <body>
   <a href="rest/jax/003">Single Parameter Test.
   </a> 
   <br/>
   <a href="rest/jax/adhi/12th/5/003">Multiple Parameter Test.
   </a> 
    <br/>
   <a href="rest/jax;name=adhi ;class = 12th ;rollNo=5;id=003">Matrix Parameter Test. 
  <!-- <a href="rest/jax/adhi;class=12th">Matrix Parameter Test. -->
   </a> 
   
   <form action="rest/jax/add" method="post">		
	Name : <input type="text" name="name" />
	<br/><br/>
	Roll No : <input type="text" name="rollNo" />
	<br/><br/>
	<input type="submit" value="Add Student" />
 </form>
  </body>
</html>