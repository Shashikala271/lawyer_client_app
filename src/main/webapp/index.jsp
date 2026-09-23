<!DOCTYPE html>
<html>
<head>
    <title>Lawyer Client Management</title>

    <style>

        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }

        body {
            font-family: Arial, sans-serif;
            background: #f5f3ff;
            color: #333;
        }

        /* Navbar */

        nav {
            background: #6a1b9a;
            color: white;
            padding: 18px 50px;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        nav h2 {
            font-size: 24px;
        }

        nav a {
            color: white;
            text-decoration: none;
            margin-left: 25px;
            font-weight: bold;
        }

        nav a:hover {
            text-decoration: underline;
        }

        /* Main section */

        .container {
            width: 90%;
            max-width: 1000px;
            margin: 60px auto;
            text-align: center;
        }

        .container h1 {
            color: #4a148c;
            margin-bottom: 10px;
        }

        .container p {
            color: #666;
            margin-bottom: 40px;
        }

        /* Cards */

        .cards {
            display: flex;
            justify-content: center;
            gap: 30px;
            flex-wrap: wrap;
        }

        .card {
            background: white;
            width: 350px;
            padding: 35px;
            border-radius: 15px;
            box-shadow: 0 5px 20px #ddd;
            transition: 0.3s;
        }

        .card:hover {
            transform: translateY(-5px);
            box-shadow: 0 8px 25px #ccc;
        }

        .icon {
            font-size: 50px;
            margin-bottom: 20px;
        }

        .card h2 {
            color: #6a1b9a;
            margin-bottom: 15px;
        }

        .card p {
            color: #666;
            line-height: 1.6;
            margin-bottom: 25px;
        }

        .btn {
            display: inline-block;
            padding: 12px 25px;
            background: #6a1b9a;
            color: white;
            text-decoration: none;
            border-radius: 6px;
            font-weight: bold;
        }

        .btn:hover {
            background: #4a148c;
        }

        /* Footer */

        footer {
            text-align: center;
            padding: 20px;
            margin-top: 60px;
            background: #eee;
            color: #666;
        }

    </style>
</head>

<body>

<!-- Navigation -->

<nav>
    <h2>⚖ Lawyer-Client</h2>

    <div>
        <a href="lawyerRegister.jsp">Lawyer</a>
        <a href="clientRegister.jsp">Client</a>
        <a href="getClients">Clients</a>
        <a href="search.jsp">Search</a>
    </div>
</nav>


<!-- Main Content -->

<div class="container">

    <h1>Lawyer & Client </h1>

    <p>
        Manage lawyers and clients easily from one place.
    </p>


    <div class="cards">

        <!-- Lawyer Card -->

        <div class="card">

            <div class="icon"></div>

            <h2>Lawyer</h2>

            <p>
                Register a new lawyer and manage lawyer
                information and client associations.
            </p>

            <a href="lawyerRegister.jsp" class="btn">
                Register Lawyer
            </a>

        </div>


        <!-- Client Card -->

        <div class="card">

            <div class="icon"></div>

            <h2>Client</h2>

            <p>
                Register a new client and maintain
                client information in the system.
            </p>

            <a href="clientRegister.jsp" class="btn">
                Register Client
            </a>


        </div>

    </div>

</div>


<!-- Footer -->

<footer>
    © 2026 Lawyer-Client Management System
</footer>

</body>
</html>