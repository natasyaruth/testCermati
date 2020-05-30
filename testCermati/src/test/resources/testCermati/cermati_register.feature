Feature: Sign Up to Cermati

  Scenario: Register flow to Cermati
    Given User in Register Page
    When User input email
    When User input kata sandi and konfirmasi kata sandi
    When User input nama depan and nama belakang
    When User input nomor telepon
    When User input Kabupaten
    When User klik button daftar akun
    Then User successfully registered

