<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Passport Form</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            font-family: Arial, sans-serif;
        }
        .container {
            margin-top: 50px;
        }
        .form-header {
            margin-bottom: 30px;
            text-align: center;
        }
        .form-header h1 {
            color: #343a40;
        }
        .form-group {
            margin-bottom: 15px;
        }
        .btn-primary {
            width: 100%;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="form-header">
            <h1>Passport Form</h1>
        </div>
        <form action="passport" method="post" class="needs-validation" novalidate>
            <div class="form-group">
                <label>Register to apply at</label><br>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="apply" id="cpvDelhi" value="CPV Delhi" required>
                    <label class="form-check-label" for="cpvDelhi">CPV Delhi</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="apply" id="passportOffice" value="Passport Office" required>
                    <label class="form-check-label" for="passportOffice">Passport Office</label>
                </div>
            </div>
            <div class="form-group">
                <label for="passportOffice">Passport Office</label>
                <select class="form-control" id="passportOffice" name="passportOffice" required>
                    <option value="">----Select----</option>
                    <option value="Bengaluru">Bengaluru</option>
                    <option value="Hyderabad">Hyderabad</option>
                    <option value="Mumbai">Mumbai</option>
                    <option value="Chennai">Chennai</option>
                    <option value="Coimbatore">Coimbatore</option>
                    <option value="Delhi">Delhi</option>
                </select>
                <div class="invalid-feedback">Please select a passport office.</div>
            </div>
            <div class="form-group">
                <label for="givenName">Given Name</label>
                <input type="text" class="form-control" id="givenName" name="givenName" required>
                <div class="invalid-feedback">Please enter your given name.</div>
            </div>
            <div class="form-group">
                <label for="surname">Surname</label>
                <input type="text" class="form-control" id="surname" name="surname" required>
                <div class="invalid-feedback">Please enter your surname.</div>
            </div>
            <div class="form-group">
                <label for="dateOfBirth">Date of Birth</label>
                <input type="date" class="form-control" id="dateOfBirth" name="dateOfBirth" required>
                <div class="invalid-feedback">Please enter your date of birth.</div>
            </div>
            <div class="form-group">
                <label for="emailId">E-mail Id</label>
                <input type="email" class="form-control" id="emailId" name="emailId" required>
                <div class="invalid-feedback">Please enter a valid email address.</div>
            </div>
            <div class="form-group">
                <label>Do you want your Login Id to be the same as E-mail Id?</label><br>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="same" id="yes" value="Yes" required>
                    <label class="form-check-label" for="yes">Yes</label>
                </div>
                <div class="form-check form-check-inline">
                    <input class="form-check-input" type="radio" name="same" id="no" value="No" required>
                    <label class="form-check-label" for="no">No</label>
                </div>
            </div>
            <div class="form-group">
                <label for="loginId">Login Id</label>
                <input type="text" class="form-control" id="loginId" name="loginId" required>
                <div class="invalid-feedback">Please enter your login ID.</div>
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" name="password" required>
                <div class="invalid-feedback">Please enter your password.</div>
            </div>
            <div class="form-group">
                <label for="confirmPassword">Confirm Password</label>
                <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" required>
                <div class="invalid-feedback">Please confirm your password.</div>
            </div>
            <div class="form-group">
                <label for="hintQuestion">Hint Question</label>
                <select class="form-control" id="hintQuestion" name="hintQuestion" required>
                    <option value="">----Select----</option>
                    <option value="Birth City">Birth City</option>
                    <option value="Favourite Colour">Favourite Colour</option>
                    <option value="Favourite Cricketer">Favourite Cricketer</option>
                    <option value="Favourite Food">Favourite Food</option>
                    <option value="First School">First School</option>
                    <option value="Make of First car Owned">Make of First car Owned</option>
                    <option value="Mothers Maiden Name">Mother's Maiden Name</option>
                </select>
                <div class="invalid-feedback">Please select a hint question.</div>
            </div>
            <div class="form-group">
                <label for="hintAnswer">Hint Answer</label>
                <input type="text" class="form-control" id="hintAnswer" name="hintAnswer" required>
                <div class="invalid-feedback">Please provide a hint answer.</div>
            </div>
            <button type="submit" class="btn btn-primary">Register</button>
        </form>
    </div>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script>
        // Example starter JavaScript for disabling form submissions if there are invalid fields
        (function() {
            'use strict';
            window.addEventListener('load', function() {
                // Fetch all the forms we want to apply custom Bootstrap validation styles to
                var forms = document.getElementsByClassName('needs-validation');
                // Loop over them and prevent submission
                var validation = Array.prototype.filter.call(forms, function(form) {
                    form.addEventListener('submit', function(event) {
                        if (form.checkValidity() === false) {
                            event.preventDefault();
                            event.stopPropagation();
                        }
                        form.classList.add('was-validated');
                    }, false);
                });
            }, false);
        })();
    </script>
</body>
</html>
