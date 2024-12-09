<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bank Account Form</title>
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
        .form-header h2 {
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
            <h2>Bank Account Form</h2>
        </div>
        <form action="bank" method="post" class="needs-validation" novalidate>
            <div class="form-group">
                <label for="accountNumber">Account Number</label>
                <input type="number" class="form-control" id="accountNumber" name="accountNumber" required>
                <div class="invalid-feedback">Please enter a valid account number.</div>
            </div>
            <div class="form-group">
                <label for="accountHolderName">Account Holder Name</label>
                <input type="text" class="form-control" id="accountHolderName" name="accountHolderName" required>
                <div class="invalid-feedback">Please enter the account holder's name.</div>
            </div>
            <div class="form-group">
                <label for="balance">Balance</label>
                <input type="number" class="form-control" id="balance" name="balance" required>
                <div class="invalid-feedback">Please enter a valid balance.</div>
            </div>
            <button type="submit" class="btn btn-primary">Save</button>
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
