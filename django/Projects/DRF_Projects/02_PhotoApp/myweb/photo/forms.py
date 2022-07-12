# 폼태그를 활용하기 위해서 사용하는 파일
from django import forms

from .models import Photo

"""
ModelForm을 상속받아 필드값을 입력으로 받는 폼을 PhotoForm 클래스로 만들었다.
"""


class PhotoForm(forms.ModelForm):
    class Meta:
        model = Photo
        fields = (
            "title" ,
            "author" ,
            "image" ,
            "description" ,
            "price"
        )
