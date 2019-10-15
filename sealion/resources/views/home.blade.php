<!DOCTYPE html>
<html lang="fr">

<head>
    <!-- INCLUDE HEAD-->
    @include('includes.head')
</head>
<body>
<header>
    <!-- INCLUDE HEADER-->
    @include('includes.header')
</header>
@yield('content')






<footer>
    <!-- INCLUDE HEADER-->
    @include('includes.footer')
</footer>
</body>


<!-- INCLUDE SCRIPTS -->
@include('includes.scripts')

</html>
