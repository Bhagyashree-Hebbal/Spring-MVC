<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Organ Donation Form</title>
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
            <h1>Organ Donation Form</h1>
        </div>
        <form action="organDonation" method="post" class="needs-validation" novalidate>
            <div class="form-group">
                <label for="name">Donor Name</label>
                <input type="text" class="form-control" id="name" name="name" required>
                <div class="invalid-feedback">Please enter the donor's name.</div>
            </div>
            <div class="form-group">
                <label for="age">Donor Age</label>
                <input type="number" class="form-control" id="age" name="age" required>
                <div class="invalid-feedback">Please enter the donor's age.</div>
            </div>
            <div class="form-group">
                <label for="bloodGroup">Blood Group</label>
                <input type="text" class="form-control" id="bloodGroup" name="bloodGroup" required>
                <div class="invalid-feedback">Please enter the donor's blood group.</div>
            </div>
            <div class="form-group">
                <label for="organ">Organ</label>
                <input type="text" class="form-control" id="organ" name="organ" required>
                <div class="invalid-feedback">Please enter the organ for donation.</div>
            </div>
            <div class="form-group">
                <label for="contactNumber">Contact Number</label>
                <input type="number" class="form-control" id="contactNumber" name="contactNumber" required>
                <div class="invalid-feedback">Please enter a valid contact number.</div>
            </div>
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" class="form-control" id="email" name="email" required>
                <div class="invalid-feedback">Please enter a valid email address.</div>
            </div>
            <div class="form-group">
                <label for="address">Address</label>
                <input type="text" class="form-control" id="address" name="address" required>
                <div class="invalid-feedback">Please enter the address.</div>
            </div>
            <div class="form-group">
                <label for="city">City</label>
                <input type="text" class="form-control" id="city" name="city" required>
                <div class="invalid-feedback">Please enter the city.</div>
            </div>
            <div class="form-group">
                <label for="state">State</label>
                <input type="text" class="form-control" id="state" name="state" required>
                <div class="invalid-feedback">Please enter the state.</div>
            </div>
            <div class="form-group">
                <label for="country">Country</label>
                <input type="text" class="form-control" id="country" name="country" required>
                <div class="invalid-feedback">Please enter the country.</div>
            </div>
            <button type="submit" class="btn btn-primary">Donate</button>
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
