<html>
<body>
<h1>Passport Form</h1>
<form action="passport" method="post">
<pre>
Register to apply at<input name="apply" type="radio" value="CPV Delhi" />CPV Delhi
                    <input name="apply" type="radio" value="Passport Office" />Passport Office
Passport Office<select>
     <option>----Select----</option>
     <option>Bengaluru</option>
     <option>Hyderbad</option>
     <option>Mumbai</option>
     <option>Chennai</option>
     <option>Coimbatore</option>
     <option>Delhi</option>
</select><br />
Given Name<input type="text" name="givenName"/>
Surname<input type="text" name="surname"/>
Date of Birth<input type="text" name="dateOfBirth"/>
E-mail Id<input type="text" name="emailId"/>
Do you want your Login Id<input name="same" type="radio" value="Yes" />Yes <input name="same" type="radio" value="No" />No
to be same as E-mail Id?
Login Id<input type="text" name="loginId"/>
Password<input type="password" name="password"/>
Confirm Password<input type="password" name="confirmPassword"/>
Hint Question<select>
     <option>----Select----</option>
     <option>Birth City</option>
     <option>Favourite Colour</option>
     <option>Favourite Cricketer</option>
     <option>Favourite Food</option>
     <option>First School</option>
     <option>Make of First car Owned</option>
     <option>Mothers Maiden Name</option>
</select><br />
Hint Answer<input type="text" name="hintAnswer"/>

<input type="submit" value="Register"/>
</pre>
</form>
</body>
</html>